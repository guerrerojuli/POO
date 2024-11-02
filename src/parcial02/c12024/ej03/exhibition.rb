class Exhibition
    def initialize(name, theme)
        @name = name
        @theme = theme
    end

    def to_s
        "Exhibition #{@name} of theme #{@theme}"
    end
end
