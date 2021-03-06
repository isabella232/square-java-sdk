
# Terminal Refund

## Structure

`TerminalRefund`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | A unique ID for this `TerminalRefund` | String getId() |
| `RefundId` | `String` | Optional | The reference to the payment refund created by completing this `TerminalRefund`. | String getRefundId() |
| `PaymentId` | `String` |  | Unique ID of the payment being refunded. | String getPaymentId() |
| `OrderId` | `String` | Optional | The reference to the Square order id for the payment identified by the `payment_id`. | String getOrderId() |
| `AmountMoney` | [`Money`](/doc/models/money.md) |  | Represents an amount of money. `Money` fields can be signed or unsigned.<br>Fields that do not explicitly define whether they are signed or unsigned are<br>considered unsigned and can only hold positive amounts. For signed fields, the<br>sign of the value indicates the purpose of the money transfer. See<br>[Working with Monetary Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts)<br>for more information. | Money getAmountMoney() |
| `Reason` | `String` | Optional | A description of the reason for the refund.<br>Note: maximum 192 characters | String getReason() |
| `DeviceId` | `String` | Optional | The unique Id of the device intended for this `TerminalRefund`.<br>The Id can be retrieved from /v2/devices api. | String getDeviceId() |
| `DeadlineDuration` | `String` | Optional | The duration as an RFC 3339 duration, after which the refund will be automatically canceled.<br>TerminalRefunds that are `PENDING` will be automatically `CANCELED` and have a cancellation reason<br>of `TIMED_OUT`<br><br>Default: 5 minutes from creation<br><br>Maximum: 5 minutes | String getDeadlineDuration() |
| `Status` | `String` | Optional | The status of the `TerminalRefund`.<br>Options: `PENDING`, `IN\_PROGRESS`, `CANCELED`, `COMPLETED` | String getStatus() |
| `CancelReason` | [`String`](/doc/models/action-cancel-reason.md) | Optional | - | String getCancelReason() |
| `CreatedAt` | `String` | Optional | The time when the `TerminalRefund` was created as an RFC 3339 timestamp. | String getCreatedAt() |
| `UpdatedAt` | `String` | Optional | The time when the `TerminalRefund` was last updated as an RFC 3339 timestamp. | String getUpdatedAt() |

## Example (as JSON)

```json
{
  "id": "id0",
  "refund_id": "refund_id4",
  "payment_id": "payment_id0",
  "order_id": "order_id6",
  "amount_money": {
    "amount": 186,
    "currency": "NGN"
  },
  "reason": "reason4",
  "device_id": "device_id6"
}
```

