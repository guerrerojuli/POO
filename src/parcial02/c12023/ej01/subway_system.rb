require "set"
require_relative "subway_station"
require_relative "subway_line"

class SubwaySystem

  def initialize(city)
    @lines = {}
  end

  def add_station(letter, name)
    line = SubwayLine.new(letter)
    @lines[line] = SortedSet.new unless @lines.key?(line)
    station = build_station(name)
    @lines[line].add(station)
    station
  end

  def lines
    @lines.keys
  end

  def stations(letter)
    line = SubwayLine.new(letter)
    @lines[line]
  end

  def build_station(name)
     SubwayStation.new(name)
  end
end