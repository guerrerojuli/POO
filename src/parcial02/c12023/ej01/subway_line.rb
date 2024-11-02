class SubwayLine
  def initialize(letter)
    @letter = letter
  end

  def to_s
    "Subway line #{letter}"
  end

  def eql?(other)
    letter == other.letter
  end

  def hash
    [ @letter ].hash
  end

  def <=>(other)
    @letter <=> other.letter
  end

  attr_reader :letter
end