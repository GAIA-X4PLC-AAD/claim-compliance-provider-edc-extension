# Claim Compliance Provider EDC Extension

## Introduction
This EDC extension integrates the Claim Compliance Provider (CCP) with the EDC platform, tested with version `0.2.1`. This means that the `send-claims` Endpoint is called to retrieve a list of W3C Verifiable Presentations.

For more information on the Claim Compliance Provider, see the [Claim Compliance Provider Repository](https://github.com/GAIA-X4PLC-AAD/claim-compliance-provider) and the [OpenAPI Specification](https://claim-compliance-provider.gxfs.gx4fm.org/docs/).

## Interfaces
This chapter describes interfaces of this integration service.

### Asset
When an asset was created this asset should be passed to the `CcpIntegrationForAssetService`, method `callClaimComplianceProvider`. 

#### Input
* This method expects a `org.eclipse.edc.spi.CoreConstants.EDC_NAMESPACE` + `claimsList` and `org.eclipse.edc.spi.CoreConstants.EDC_NAMESPACE` + `gxParticipantCredentials` in the asset properties as base64 encoded strings.
  > The current value of `org.eclipse.edc.spi.CoreConstants.EDC_NAMESPACE` is `https://w3id.org/edc/v0.0.1/ns/` 
* These parameters are taken and forwarded to the Claim Compliance Provider
* For further information see javadoc of `CcpIntegrationForAssetService`

#### Output
* As a result an updated `Asset` is returned.
* The `Asset` has an additional property: `org.eclipse.edc.spi.CoreConstants.EDC_NAMESPACE` + `claimComplianceProviderResponse` which contains the response of the Claim Compliance Provider as a string.

### ContractDefinition
When a contract definition was created this contract definition should be passed to the `CcpIntegrationForContractDefinitionService`, method `getVerifiablePresentationsFromAssets`.

### Ingoing
* This method expects one or more `Asset`s in a `ContractDefinition` having the asset property `org.eclipse.edc.spi.CoreConstants.EDC_NAMESPACE` + `claimComplianceProviderResponse`.
* All `claimComplianceProviderResponse` are retrieved from the `Asset`s.

### Outgoing
* As a result a list of `claimComplianceProviderResponse`s is returned.

## Integration into the EDC

### Code

### Configuration

<dependency>
  <groupId>com.msg.plcaad.edc</groupId>
  <artifactId>claim-compliance-provider-edc-extension</artifactId>
  <version>1.0.0</version>
</dependency>

## Contribution
Feel free to contribute to this project. You can do this by pushing a new branch and creating a pull request or by a fork of this repository with a pull request.

## License
see [LICENSE](LICENSE).
