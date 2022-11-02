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
  git clone -b "hello-world-spring-boot" "https://github.com/SumeetBandgar/Java.git"
}

def build(){
 mvn clean install
}
