
## CRC

| CustomerParty   |       | 
|----------|:-------------:|
| Send sign up request to the restaurant with Info (name, phone, party size) | Restaurant |
| Confirm / Cancel request|       | 

| Restaurant   |            | 
|----------|:-------------:|
| Add new customers to wait queue | Restaurant |
| Remove customers from wait queue |  CustomerParty | 

| Wait Queue   |            | 
|----------|:-------------:|
| Find empty table which satisfy Customer requirement | Restaurant |
| Notify Customer via Text Message | CustomerParty | 
