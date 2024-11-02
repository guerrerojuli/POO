class Pavilion
    attr_reader :cap

    def initialize(name, cap)
        @name = name
        @cap = cap
    end

    def add_exhibition(exhibition)
        raise "Cannot add exhibition" if @exhibitions.size == @cap
        @exhibitions.push(exhibition)
    end

    def ==(other)
      return false unless other.is_a?(Pavilion)
      [@name, @cap] == [other.name, other.cap]
    end


    def hash
      [@name, @cap].hash
    end

    def <=>(other)
        to_s() <=> other.to_s()
    end

    def to_s
        "Pavilion #{@name} with cap #{@cap}"
    end

    alias_method :eql?, :==

    protected attr_reader :name
end
