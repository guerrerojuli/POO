class Triangle < Figure
  attr_reader :point1, :point2, :point3

  def initialize(point1, point2, point3)
    @point1 = point1
    @point2 = point2
    @point3 = point3
  end

  def perimeter
    side1 = @point1.distance(@point2)
    side2 = @point2.distance(@point3)
    side3 = @point3.distance(@point1)
    side1 + side2 + side3
  end

  def area
    # Using Heron's formula to calculate the area
    a = @point1.distance(@point2)
    b = @point2.distance(@point3)
    c = @point3.distance(@point1)
    s = (a + b + c) / 2.0
    Math.sqrt(s * (s - a) * (s - b) * (s - c))
  end

  def ==(other)
    return false unless other.is_a? Triangle
    @point1 == other.point1 && @point2 == other.point2 && @point3 == other.point3
  end

  def to_s
    "Traingle [ #{@point1} #{@point2} #{@point3} ]"
  end
end
