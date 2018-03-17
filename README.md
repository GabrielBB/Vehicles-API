# Vehicles API
Public REST API to get Vehicles Types, Brands and Models.

NOTE: Because i'm using a free server, for now, the server shuts down after 30 minutes of inactivity. So, give it some time the first time you request it. If it takes some time, is because nobody made request in the last 30 minutes

## Paths

| Path | Method | Description | Parameters
|--|--|--|--|
| /brands | GET | Returns all the vehicle brands | 
| /types  | GET | Returns all the vehicle types  |
| /models | GET | Returns Vehicle Models that the brand manufacturer has built. It must be filtered by Brand or Type | `brandId` ID of an object returned from /brands. `typeId` ID of an object returned from /types

## Examples

**Example 1**: Get every available brand (Full result not shown here, too much data)

 **Endpoint**: https://the-vehicles-api.herokuapp.com/brands/
 
 **Result**: 

```json
     [{"id":36,"brand":"Acura"},
     {"id":29,"brand":"Alfa Romeo"},
     {"id":569,"brand":"Alkanes"},
     {"id":400,"brand":"Artic Cat"},
     {"id":565,"brand":"Aston Martin"}]
```

**Example 2**: Get every available vehicle type

 **Endpoint**: https://the-vehicles-api.herokuapp.com/types/
 
 **Result**: 

```json
     [{"id":1,"type":"Car"},
     {"id":2,"type":"Motorcycle"},
     {"id":3,"type":"Ship"},
     {"id":4,"type":"Heavy Vehicle"},
     {"id":5,"type":"Accesories"}]
```

**Example 3**: Get BMW vehicle models

 **Endpoint**: https://the-vehicles-api.herokuapp.com/models?brandId=17
 
 **Result**: 

```json
     [{"id":384,"model":"Serie 1",
     "brand":{"id":17,"brand":"BMW"},
     "type":{"id":1,"type":"Car"}},
     
     {"id":1548,"model":"GS",
     "brand":{"id":17,"brand":"BMW"},
     "type":{"id":2,"type":"Motor"}},
     
     {"id":1640,"model":"Serie 3",
     "brand":{"id":17,"brand":"BMW"},
     "type":{"id":1,"type":"Car"}},
     
     {"id":1649,"model":"Serie 5",
     "brand":{"id":17,"brand":"BMW"},
     "type":{"id":1,"type":"Car"}}]
     ```
