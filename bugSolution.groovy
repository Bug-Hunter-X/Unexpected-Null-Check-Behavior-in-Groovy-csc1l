```groovy
def myMethod(param) {
  if (param == null || param.isEmpty()) {
    println "Parameter is null or empty"
    return
  }
  // ... rest of the method
}

myMethod(null)
myMethod([:]) // This will now print 'Parameter is null or empty'
```