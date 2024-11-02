require_relative "max_city_bookings"
require_relative "booking_exception"

class ApprovedCityBookings < MaxCityBookings
    def initialize(city, max_bookings, approved_attractions)
        super(city, max_bookings)
        @approved_attractions = approved_attractions
    end

    def book(attraction, day)
        raise BookingException.new("Attraction not approved") unless @approved_attractions.include?(attraction)
        super
    end
end
