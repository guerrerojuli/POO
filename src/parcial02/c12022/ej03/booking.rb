class Booking
    include Comparable

    def initialize(attraction, day)
        @attraction = attraction
        @day = day
    end

    def <=>(other)
        return nil unless other.is_a?(Booking)
        cmp = @day <=> other.day
        cmp = @attraction <=> other.attraction if cmp == 0
        cmp
    end

    def inspect 
        "#{@attraction} on the day #{@day}"
    end

    attr_reader :attraction, :day
end
