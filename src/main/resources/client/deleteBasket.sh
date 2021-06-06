# bin/sh

url="http://$1:$2/baskets/$3"

curl --location --request DELETE ${url}