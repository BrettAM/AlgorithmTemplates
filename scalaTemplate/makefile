BLD=build
FSC_ARGS=-opt:_
SOURCE=Solver.scala
MAIN_CLASS=Solver
TEST_CLASS=Test
JVM_ARGS=-J-server -J-Xms128m -J-Xmx6g -J-Xss4m
INPUT=input.txt
OUTPUT=output.txt

run: compile
	scala -classpath $(BLD) $(JVM_ARGS) $(MAIN_CLASS) $(INPUT) $(OUTPUT)

test: compile
	scala -classpath $(BLD) $(JVM_ARGS) $(TEST_CLASS)

repl: compile
	scala -classpath $(BLD) $(JVM_ARGS) -i $(SOURCE)

compile: setup
	fsc $(FSC_ARGS) -d $(BLD) $(SOURCE)

setup:
	mkdir -p $(BLD)
