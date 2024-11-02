# Abstract Figure class
class Figure
  def initialize
    raise NotImplementedError, "Subclasses must implement initialize"
  end

  def perimeter
    raise NotImplementedError, "Subclasses must implement perimeter"
  end

  def area
    raise NotImplementedError, "Subclasses must implement area"
  end

  def <=>(other)
    area <=> other.area
  end
end
