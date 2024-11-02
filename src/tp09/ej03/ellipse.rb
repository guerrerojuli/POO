require_relative "ellipse"

class Ellipse < Figure
  attr_reader :center, :a, :b

  def initialize(center, a, b)
    @center = center
    @a = a
    @b = b
  end

  def area
    # Using the formula for the area of an ellipse: A = π * a * b
    Math::PI * @a * @b
  end

  def perimeter 
    # Using the formula for the circumference of an ellipse: C ≈ 2 * π * sqrt((a^2 + b^2) / 2)
    2 * Math::PI * Math.sqrt((@a**2 + @b**2) / 2.0)
  end


  def ==(other)
    return false unless other.is_a? Ellipse
    @center == other.center && @a == other.a && @b == other.b
  end

  def to_s
    "Ellipse [ #{@center}, #{@a}, #{@b} ]"
  end
end
