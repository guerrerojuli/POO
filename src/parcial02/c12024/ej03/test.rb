require_relative "pavilion"
require_relative "themed_pavilion"
require_relative "museum"
require_relative "themed_museum"

# Se instancia un museo que contará con pabellones
# donde se verifica que la cantidad de exhibiciones no supere el máximo del pabellón
field_museum = Museum.new


# Se instancia un pabellón "Dinosaurs" con capacidad de 2 exhibiciones
dinosaurs_pavilion = Pavilion.new('Dinosaurs', 2)


# Se agrega la exhibición "Dinosaurs of Antarctica 3D" al pabellón "Dinosaurs"
field_museum.add_exhibition(dinosaurs_pavilion, 'Dinosaurs of Antarctica 3D', 'Nature')


field_museum.add_exhibition(dinosaurs_pavilion, 'Inside Ancient Egypt', 'History')


begin
 # Falla pues se alcanzó el máximo de exhibiciones del pabellón
 field_museum.add_exhibition(dinosaurs_pavilion, 'SUE the T. rex', 'Nature')
rescue => e
 puts e.message # Cannot add exhibition
end


# Se itera por todas las exhibiciones del pabellón en orden de inserción
field_museum.pavilion_exhibits(Pavilion.new('Dinosaurs', 2)).each { |exh| puts exh }
# Exhibition Dinosaurs of Antarctica 3D of theme Nature
# Exhibition Inside Ancient Egypt of theme History


p field_museum.pavilion_exhibits(Pavilion.new('Egypt', 3)) # nil


egypt_pavilion = Pavilion.new('Egypt', 3)


field_museum.add_exhibition(egypt_pavilion, 'Inside Ancient Egypt', 'History')
field_museum.add_exhibition(egypt_pavilion, 'Inside Ancient Egypt', 'History')


field_museum.pavilion_exhibits(Pavilion.new('Egypt', 3)).each { |exh| puts exh }
# Exhibition Inside Ancient Egypt of theme History
# Exhibition Inside Ancient Egypt of theme History


# Se itera los pabellones en orden alfabético por su representación simbólica (to_s)
field_museum.pavilions.map { |pav| pav.to_s }.sort.each { |pav| puts pav }
# Pavilion Dinosaurs with cap 2
# Pavilion Egypt with cap 3


# Se instancia un museo que contará con pabellones temáticos
# donde se verifica que la cantidad de exhibiciones no supere el máximo del pabellón
# y que la temática de las exhibiciones coincida con la temática del pabellón
themed_field_mus = ThemedMuseum.new


# Se instancia un pabellón temático "Dinosaurs" con capacidad de 3 exhibiciones
# y la temática "Nature"
themed_dinosaurs_pav = ThemedPavilion.new("Dinosaurs", 3, "Nature")


themed_field_mus.add_exhibition(themed_dinosaurs_pav, 'Dinosaurs of Antarctica 3D', 'Nature')


begin
 # Falla pues la temática de la exhibición no coincide con la temática del pabellón
 themed_field_mus.add_exhibition(themed_dinosaurs_pav, 'Inside Ancient Egypt', 'History')
rescue => e
 puts e.message # Theme does not match
end


themed_field_mus.add_exhibition(themed_dinosaurs_pav, 'SUE the T. rex', 'Nature')
themed_field_mus.add_exhibition(themed_dinosaurs_pav, 'Griffin Halls', 'Nature')


begin
 # Falla pues se alcanzó el máximo de exhibiciones del pabellón temático
 themed_field_mus.add_exhibition(themed_dinosaurs_pav, 'Birds of America', 'Nature')
rescue => e
 puts e.message # Cannot add exhibition
end


themed_field_mus.pavilion_exhibits(themed_dinosaurs_pav).each { |exh| puts exh }
# Exhibition Dinosaurs of Antarctica 3D of theme Nature
# Exhibition SUE the T. rex of theme Nature
# Exhibition Griffin Halls of theme Nature


# Se instancia un pabellón temático "Egypt" con capacidad de 5 exhibiciones
# y la temática "History"
themed_egypt_pav = ThemedPavilion("Egypt", 5, "History")


themed_field_mus.add_exhibition(themed_egypt_pav, 'Inside Ancient Egypt', 'History')


themed_field_mus.pavilions.map { |pav| pav.to_s }.sort.each { |pav| puts pav }
# History Themed Pavilion Egypt with cap 5
# Nature Themed Pavilion Dinosaurs with cap 3

