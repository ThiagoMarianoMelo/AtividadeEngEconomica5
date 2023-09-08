import csv

Loc = []

with open(f'ComplexProjectMetrics/class.csv') as file:
      reader = csv.DictReader(file, delimiter=',')
      for row in reader:
        Loc.append(int(row['loc']))

file.close()

totalLines = 0

for value in Loc:
    totalLines += value

print(totalLines) #32279 lines