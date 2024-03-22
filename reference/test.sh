# installation
# mvn clean package


# JAVA WRITTEN Aroma (for java)
# compile entire corpus to ast json file and create jsrc.json from all Java files under jsrc
# time mvn exec:java -Dexec.mainClass=ConvertJava -Dexec.args="compilationUnit jsrc.json ./jsrc"    


# convert query_file.java into ast in json format
# time mvn exec:java -Dexec.mainClass=ConvertJava -Dexec.args="compilationUnit query_file.json data/example_query.java"

# # featurize asts
# time python3 src/main/python/similar.py -c ../../../jsrc.json -d ../../../tmpout
# # run experiments assuming that featurization has already been done
# time python3 src/main/python/similar.py -d ../../../tmpout -t
# # search code at index 83403 of the corpus
# time python3 src/main/python/similar.py -d ../../../tmpout -i 83403
# # search using the query ast in query_file.json
# time python3 src/main/python/similar.py -d ../../../tmpout -f query_file.json


# featurize asts
# time python3 src/main/python/similar.py -c jsrc.json -d tmpout


# run experiments assuming that featurization has already been done
# time python3 src/main/python/similar.py -d tmpout -t
# search code at index 83403 of the corpus
# time python3 src/main/python/similar.py -d tmpout -i 83403
# search using the query ast in query_file.json
# 




# JAVA WRITTEN version of Aroma for Python

# # convert corpus into ASTS in json format
# time mvn exec:java -Dexec.mainClass=ConvertPy -Dexec.args="file_input jsrc.json ./pysc"
# # convert query into AST
# time mvn exec:java -Dexec.mainClass=ConvertPy -Dexec.args="file_input query_file.json data/example_query.py"

# # featurize asts
# time python3 src/main/python/similar.py -c jsrc.json -d tmpout
# # run tests
# time python3 src/main/python/similar.py -d tmpout -f query_file.json





# PYTHON WRITTEN version of Aroma for python

time python3 src/main/python/ConvertPy.py "./pysc/example_query.py" "jsrc.json"

time python3 src/main/python/ConvertPy.py "data/example_query.py" "query_file.json"


# featurize asts
time python3 src/main/python/similar.py -c jsrc.json -d tmpout
# run tests
time python3 src/main/python/similar.py -d tmpout -f query_file.json
