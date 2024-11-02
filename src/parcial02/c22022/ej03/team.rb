class Team
  def initialize(name)
    @name = name
  end

  def eql?(other)
    return false unless other.is_a?(Team)
    @name = other.name
  end

  def hash
    [ @name ].hash
  end

  def <=>(other)
    @name <=> other.name
  end

  def to_s
    name
  end

  attr_reader :name
end