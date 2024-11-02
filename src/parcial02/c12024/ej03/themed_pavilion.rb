require_relative "pavilion"

class ThemedPavilion < Pavilion
  attr_reader :theme

  def initialize(name, cap, theme)
    super(name, cap)
    @theme = theme
  end
end
