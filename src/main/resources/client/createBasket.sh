# bin/sh

url="http://$1:$2/baskets"

curl --location --request POST ${url} \
--header "Accept: application/json" \
--header "Content-Type: application/json" \
--data "{
    \"name\": \"$3\"
}"