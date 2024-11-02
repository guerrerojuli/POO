require_relative "city_bookings"
require_relative "max_city_bookings"
require_relative "approved_city_bookings"

# Se crea un pase para reservar atracciones en la ciudad de Chicago
cb = CityBookings.new('Chicago')
puts cb.city # Chicago
# Se reserva la atracción Shedd Aquarium para el día 25 del mes
cb.book('Shedd Aquarium', 25)
cb.book('360 Chicago', 27)
cb.book('Adler Planetarium', 25)

# Imprime todas las reservas del pase en orden cronológico
# y desempata alfabéticamente por nombre de atracción
cb.bookings.each { |booking| p booking }
 # Booking of Adler Planetarium on the day 25
 # Booking of Shedd Aquarium on the day 25
 # Booking of 360 Chicago on the day 27

# Se crea un pase para reservar atracciones en la ciudad de Chicago
# con un máximo de 2 reservas
max_cb = MaxCityBookings.new('Chicago', 2)
puts max_cb.city # Chicago
max_cb.book('Shedd Aquarium', 25)
max_cb.book('360 Chicago', 25)
# Se arroja un error pues se alcanzó el máximo de 2 reservas
begin
 max_cb.book('Adler Planetarium', 27)
rescue BookingException => e
 puts e.message # Reached Max
end

max_cb.bookings.each { |booking| p booking }
 # Booking of 360 Chicago on the day 25
 # Booking of Shedd Aquarium on the day 25

# Array con las atracciones aprobadas
approved_attractions = ['Skydeck', 'Shedd Aquarium', 'Adler Planetarium']
# Se crea un pase para reservar atracciones en la ciudad de Chicago
# con un máximo de 2 reservas
# donde sólo se podrán reservar las atracciones aprobadas
approved_cb = ApprovedCityBookings.new('Chicago', 2, approved_attractions)
puts approved_cb.city # Chicago
approved_cb.book('Shedd Aquarium', 25)
# Se arroja un error pues la atracción no está aprobada
begin
    approved_cb.book('360 Chicago', 27)
rescue BookingException => e
    puts e.message # Attraction not approved
end
approved_cb.book('Skydeck', 27)
# Se arroja un error pues se alcanzó el máximo de 2 reservas
begin
    approved_cb.book('Adler Planetarium', 27)
rescue BookingException => e
    puts e.message # Reached Max
end

approved_cb.bookings.each { |booking| p booking }
# Booking of Shedd Aquarium on the day 25
# Booking of Skydeck on the day 27

b1 = Booking.new('Foo', 3)
b2 = Booking.new('Bar', 5)
b3 = Booking.new('Abc', 4)
puts b3.between?(b1, b2) # true
puts b3.between?(b2, b1) # false
