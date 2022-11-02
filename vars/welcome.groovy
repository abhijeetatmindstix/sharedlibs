def call(name){
  echo "Hey ${name}, How are you?"
}

def add(x,y)
{
  echo "sum of ${x} and ${y} is ${x+y}"
}

def mul(x,y)
{
  echo ",multiple of ${x} and ${y} is ${x*y}"
}

def checkout(){
  git branch: 'hello-world-spring-boot', url: 'https://github.com/SumeetBandgar/Java.git'
}

def build(){
 sh "mvn clean install"
}
