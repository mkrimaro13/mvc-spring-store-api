# System Design

## Domain layer
The system has three main classes:
- ``Product``s
- ``Customer``s
- ``Order``s

### Products
A ``Product`` is a basic class that contains the basic necessary information related to a product, like name, description, and it's ``Category``.

The ``Product`` class only identifies a general entity of a product, like T-shirt, bra, pantie, skirt, etc.
The ``Category`` class allows to separate the products on its categories, like underwear, sleepwear, comfortable, or exercise.

Each product requires a Size to allow customization, for example, a T-shirt of small size, and a T-shirt of medium size, are T-shirts, share the same ``Product`` information.

For that there appears another class ``ProductVariant``, a Variant of a Product is an extended description of a ``Product`` that includes the ``Size`` and additional attributes like its ``color`` or how many ``availableUnits`` are for a ``ProductVariant``.

For example:
- ``Product``: a rodless silk bra.
- `Category`: this class goes inside of `Product` and this case the category could be 'underwear'.
- ``ProductVariant``: it holds and instance of a ``Product`` and complements it with more detail such as, an instance of ``Size`` class, and two more attributes ``color`` and ``availableUnits``.

So, the product is 'rodless silk bra', color white, of small size and has 3 available units.

Also, it could be a black rodless silk bra of medium size that has 5 available units.

### Customer
A ``Customer`` is the basic class that contains the necessary information related to the users, like name, gender, email and document number.

Inside a ``Customer`` it is included a ``CustomerAddress``, that is another object with the extended information of its address necessary to do shipments.

### Order
A ``Order`` is a class that contains a single ``Customer`` and a List of ``OrderItem``s, due a user can buy more than one product on its different variants.

And ``OrderItem`` is a class that contains an instance of ``ProductVariant`` and a ``quantity`` of that product in an order.