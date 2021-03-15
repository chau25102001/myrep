import pandas as pd

df = pd.read_csv('new_bank.csv')

from sklearn.preprocessing import LabelEncoder
from sklearn.model_selection import train_test_split
from sklearn import neighbors
from sklearn import metrics

X = df[['age','job','marital','education','default','balance','housing','loan','contact','day','month','duration','campaign','pdays','previous','poutcome']].values
y = df[['y']].values
le = LabelEncoder()
for i in range(len(X[0])):
    X[:,i] = le.fit_transform(X[:,i])
def tran_result(x):
    if x == 'no':
        return 0
    if x == 'yes':
        return 1
    else:
        return -1
df['y'] = df['y'].apply(tran_result)
y = df[['y']].values
X_train, X_test, y_train, y_test = train_test_split(X,y, test_size=0.3)
knn = neighbors.KNeighborsClassifier(n_neighbors=10, weights = 'uniform')
knn.fit(X_train, y_train)
prediction = knn.predict(X_test)
accuracy = metrics.accuracy_score(y_test,prediction)
indx = []
for i in range(len(y_test)):
    if y_test[i][0] ==1:
        indx.append(i)
print(indx)
print("prediction", prediction)
print("accuracy", accuracy)
print('real value: ', y_test[0])
print('predicted: ', prediction[5])