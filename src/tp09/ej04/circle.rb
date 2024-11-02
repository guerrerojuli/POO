require_relative "figure"
require_relative "ellipse"

class Circle < Ellipse
  attr_reader :ratio, :center

  def initialize(center, ratio)
    super(center, ratio, ratio) # Call the Ellipse initializer with equal radio
    @center = center
    @ratio = ratio
  end

  def to_s
    "Circle [ #{@center}, #{@ratio} ]"
  end

  def hash
    [@center, @ratio].hash
  end

  def eql?(other)
    return false unless other.is_a? Circle
    @center == other.center && @ratio == other.ratio 
  end

  def inspect
    to_s()
  end
end
