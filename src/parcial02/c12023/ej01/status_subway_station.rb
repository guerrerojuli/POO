require_relative "subway_station"

class StatusSubwayStation < SubwayStation
  def initialize(name)
    super(name)
    @open = true
  end

  def close_station
    @open = false
  end

  def open_station
    @open = true
  end

  def to_s
    super + " is " + ((@open) ? "Open" : "Close")
  end
end