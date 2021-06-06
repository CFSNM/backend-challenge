# bin/sh

url="http://$1:$2/baskets/$3/products"

curl --location --request PUT ${url} \
--header "Accept: application/json" \
--header "Content-Type: application/json" \
--data "{
    \"productType\": \"$4\"
}"