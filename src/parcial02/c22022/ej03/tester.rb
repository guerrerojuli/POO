require_relative "world_cup"
require_relative "team"

world_cup = WorldCup.new
# Se imprimen las posiciones de todos los equipos de todos los grupos
# Como no hay equipos solo imprime un título
puts world_cup
# World Cup


# Se agrega Francia como equipo del grupo D
world_cup.add_team('D', Team.new('France'))
world_cup.add_team('D', Team.new('Australia'))
world_cup.add_team('D', Team.new('Denmark'))
world_cup.add_team('D', Team.new('Tunisia'))
world_cup.add_team('E', Team.new('Spain'))
world_cup.add_team('E', Team.new('Costa Rica'))
world_cup.add_team('E', Team.new('Germany'))
world_cup.add_team('E', Team.new('Japan'))


# Se imprimen las posiciones de todos los equipos de todos los grupos
# en orden alfábetico por nombre del grupo, y luego, para cada equipo
# descendente por puntos, descendente por goles a favor, descendente
# por goles en contra y desempata alfabéticamente por nombre
# donde P = Puntos, GF = Goles a Favor, GC = Goles en Contra
puts world_cup
# World Cup
# D
# Team P  GF GC
# Australia  0  0  0
# Denmark  0  0  0
# France 0  0  0
# Tunisia  0  0  0
# E
# Team P  GF GC
# Costa Rica 0  0  0
# Germany  0  0  0
# Japan  0  0  0
# Spain  0  0  0


# Francia le gana por 4 a 1 a Australia, de forma que Francia suma 3 puntos y Australia 0
world_cup.play_match('D', Team.new('France'), Team.new('Australia'), 4, 1)
# Alemania le gana por 2 a 0 a España, de forma que Alemania suma 3 puntos y España 0
world_cup.play_match('E', Team.new('Spain'), Team.new('Germany'), 0, 2)
# Costa Rica y Japón empatan, de forma que ambos equipos suman 1 punto
world_cup.play_match('E', Team.new('Costa Rica'), Team.new('Japan'), 2, 2)
world_cup.play_match('D', Team.new('Denmark'), Team.new('Tunisia'), 2, 0)


puts world_cup
# World Cup
# D
# Team P  GF GC
# France 3  4  1
# Denmark  3  2  0
# Australia  0  1  4
# Tunisia  0  0  2
# E
# Team P  GF GC
# Germany  3  2  0
# Costa Rica 1  2  2
# Japan  1  2  2
# Spain  0  0  2


begin
  # Se arroja un error porque no existe el grupo A
  world_cup.play_match('A', Team.new('France'), Team.new('Australia'), 1, 2)
rescue WorldCupError => e
  puts e.message # Missing Group
end


begin
  # Se arroja un error porque no existe el equipo Costa Rica en el grupo D
  world_cup.play_match('D', Team.new('Costa Rica'), Team.new('Australia'), 1, 2)
rescue WorldCupError => e
  puts e.message # Missing Team
end
