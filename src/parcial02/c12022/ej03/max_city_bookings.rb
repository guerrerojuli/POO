require_relative "city_bookings"
require_relative "booking_exception"

class MaxCityBookings < CityBookings
    def initialize(city, max_bookings)
        super(city)
        @max_bookings = max_bookings
    end

    def book(attraction, day)
        raise BookingException.new("Reached max") if @bookings.size >= @max_bookings
        super
    end
end
