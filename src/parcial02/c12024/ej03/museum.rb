require 'sorted_set'
require_relative "exhibition"

class Museum
    @sorted_pavilions = SortedSet.new
    @pavilions = {}

    def add_exhibition(pavilion, exhibition, theme)
        if !@pavilions.key?(pavilion) then
            @pavilions[pavilion] = []
            @sorted_pavilions.add(pavilion)
        end
        raise "Cannot add exhibition" if @pavilions[pavilions].size == pavilion.cap
        @pavilions[pavilion].push(Exhibition.new(exhibition, theme))
    end

    def pavilion_exhibits(pavilion)
        @pavilions[pavilion] or []
    end

    def pavilions
        @sorted_pavilions
    end
end
