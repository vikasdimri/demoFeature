package example.demo.parse;

import example.demo.parse.gtt.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ParseingDemoMain {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new XmlMapper();

        Order order = mapper.readValue(
                StringUtils.toEncodedString(orderString.getBytes(), StandardCharsets.UTF_8),
                Order.class);;

        System.out.println("Order " + order.toString());

    }

    private static String orderString = "<Order xmlns=\"urn:ford/Order/v1.0\">\n" +
            "    <header>\n" +
            "        <version>310</version>\n" +
            "        <documentType>Order</documentType>\n" +
            "        <messageId>20200422004009</messageId>\n" +
            "    </header>\n" +
            "    <orderDetail>\n" +
            "        <messageFunctionCode>OriginalReplace</messageFunctionCode>\n" +
            "        <poNumber>MPBUMFF50LX275673</poNumber>\n" +
            "        <orderFunctionCode>AmendReplace</orderFunctionCode>\n" +
            "        <orderTerms>\n" +
            "            <orderDate>\n" +
            "                <orderDateTypeCode>Issue</orderDateTypeCode>\n" +
            "                <orderDateValue>2020-02-15</orderDateValue>\n" +
            "            </orderDate>\n" +
            "            <reference>\n" +
            "                <type>Last8OfVIN</type>\n" +
            "                <value>LX275673</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>LogicalVIN</type>\n" +
            "                <value>MPBUMFF50LX275673</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>PlantFVC</type>\n" +
            "                <value>FTM Rayong AP -MX</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>OriginRouteCode</type>\n" +
            "                <value>XXX</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>LaneCategory</type>\n" +
            "                <value>AP-AP</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>PortOfLoad</type>\n" +
            "                <value>Port of Laem Chabang-THLCH</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>PortOfDischarge</type>\n" +
            "                <value>Port of Brisbane-AUBNE</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>Division</type>\n" +
            "                <value>FV</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>OrderingDealerCode</type>\n" +
            "                <value>12430-AU</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>OrderingDealerName</type>\n" +
            "                <value>Hansen Ford</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>DealerCountry</type>\n" +
            "                <value>AUSTRALIA</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>StockingDealerName</type>\n" +
            "                <value>FORD MTR CO OF AUSTRALIA LTD</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>StockingGlobalDealerCode</type>\n" +
            "                <value>900767</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>StockingLocalDealerCode</type>\n" +
            "                <value>AJ000</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>Filename</type>\n" +
            "                <value>FORDIT_IN_ORDER_MPBUMFF50LX275673_20200422004009.xml</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>MarketBusinessUnit</type>\n" +
            "                <value>Asia-Pacific Business</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>CoverageType</type>\n" +
            "                <value>Other</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>ShippingTermsLeg1</type>\n" +
            "                <value>Ford</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>PCVCode</type>\n" +
            "                <value>FMF2020253G</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>PCVDescription</type>\n" +
            "                <value>Ranger Double Cab Wildtrak 3.2D AT 4WD</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>GLPSentDateLeg1</type>\n" +
            "                <value>2020-03-02 00:00:00.0</value>\n" +
            "            </reference>\n" +
            "            <reference>\n" +
            "                <type>WORKSBillOfLadingDateLeg1</type>\n" +
            "                <value>2020-03-23 00:00:00.0</value>\n" +
            "            </reference>\n" +
            "            <shipmentMethodCode>M</shipmentMethodCode>\n" +
            "        </orderTerms>\n" +
            "        <party>\n" +
            "            <partyRoleCode>OriginYardOperator</partyRoleCode>\n" +
            "            <identification>\n" +
            "                <type>FordID</type>\n" +
            "                <value>MX-GL06A-OYO</value>\n" +
            "            </identification>\n" +
            "            <name>NYK Auto Logistics</name>\n" +
            "            <address>\n" +
            "                <addressLine1>500/103 Moo 3 Tambol Tasit</addressLine1>\n" +
            "                <addressLine2>Amphur Pluakdaeng</addressLine2>\n" +
            "                <city>Rayong</city>\n" +
            "                <stateOrProvince>12</stateOrProvince>\n" +
            "                <postalCodeNumber>21140</postalCodeNumber>\n" +
            "                <countryCode>TH</countryCode>\n" +
            "                <locationQualifierCode>Custom</locationQualifierCode>\n" +
            "                <locationCode>MX</locationCode>\n" +
            "            </address>\n" +
            "        </party>\n" +
            "        <party>\n" +
            "            <partyRoleCode>Dealer</partyRoleCode>\n" +
            "            <identification>\n" +
            "                <type>FordID</type>\n" +
            "                <value>12430-AU</value>\n" +
            "            </identification>\n" +
            "            <name>Hansen Ford</name>\n" +
            "            <address>\n" +
            "                <addressLine1>279-283 Byrnes St</addressLine1>\n" +
            "                <city>Mareeba</city>\n" +
            "                <postalCodeNumber>4880</postalCodeNumber>\n" +
            "                <countryCode>AU</countryCode>\n" +
            "            </address>\n" +
            "        </party>\n" +
            "        <party>\n" +
            "            <partyRoleCode>Plant</partyRoleCode>\n" +
            "            <identification>\n" +
            "                <type>FordID</type>\n" +
            "                <value>MX</value>\n" +
            "            </identification>\n" +
            "            <name>FTM Rayong AP</name>\n" +
            "            <address>\n" +
            "                <addressLine1>500/103 Moo 3 Tambol Tasit</addressLine1>\n" +
            "                <addressLine2>Amphur Pluakdaeng</addressLine2>\n" +
            "                <city>Rayong</city>\n" +
            "                <stateOrProvince>12</stateOrProvince>\n" +
            "                <postalCodeNumber>21140</postalCodeNumber>\n" +
            "                <countryCode>TH</countryCode>\n" +
            "                <locationQualifierCode>Custom</locationQualifierCode>\n" +
            "                <locationCode>MX</locationCode>\n" +
            "            </address>\n" +
            "        </party>\n" +
            "        <party>\n" +
            "            <partyRoleCode>FinalShipTo</partyRoleCode>\n" +
            "            <identification>\n" +
            "                <type>FordID</type>\n" +
            "                <value>12430-AU</value>\n" +
            "            </identification>\n" +
            "            <name>Hansen Ford</name>\n" +
            "            <address>\n" +
            "                <addressLine1>279-283 Byrnes St</addressLine1>\n" +
            "                <city>Mareeba</city>\n" +
            "                <postalCodeNumber>4880</postalCodeNumber>\n" +
            "                <countryCode>AU</countryCode>\n" +
            "            </address>\n" +
            "        </party>\n" +
            "        <party>\n" +
            "            <partyRoleCode>OriginPortProcessor</partyRoleCode>\n" +
            "            <identification>\n" +
            "                <type>FordID</type>\n" +
            "                <value>LCH-GL06A-PP</value>\n" +
            "            </identification>\n" +
            "            <name>NYK Auto Logistics</name>\n" +
            "            <address>\n" +
            "                <addressLine1>444 Tarua Road Klongtoey</addressLine1>\n" +
            "                <city>Laem Chabang</city>\n" +
            "                <stateOrProvince>20</stateOrProvince>\n" +
            "                <postalCodeNumber>10110</postalCodeNumber>\n" +
            "                <countryCode>TH</countryCode>\n" +
            "                <locationQualifierCode>UNLocationCode</locationQualifierCode>\n" +
            "                <locationCode>THLCH</locationCode>\n" +
            "            </address>\n" +
            "        </party>\n" +
            "        <party>\n" +
            "            <partyRoleCode>DestinationPortProcessor</partyRoleCode>\n" +
            "            <identification>\n" +
            "                <type>FordID</type>\n" +
            "                <value>BNE-AVSEC-PP</value>\n" +
            "            </identification>\n" +
            "            <name>CEVA Logistics</name>\n" +
            "            <address>\n" +
            "                <addressLine1>1 Sandpiper Avenue\n" +
            "                    , Locked Bag 1818\n" +
            "                </addressLine1>\n" +
            "                <city>Brisbane</city>\n" +
            "                <stateOrProvince>QLD</stateOrProvince>\n" +
            "                <postalCodeNumber>4178</postalCodeNumber>\n" +
            "                <countryCode>AU</countryCode>\n" +
            "                <locationQualifierCode>UNLocationCode</locationQualifierCode>\n" +
            "                <locationCode>AUBNE</locationCode>\n" +
            "            </address>\n" +
            "        </party>\n" +
            "        <orderItem>\n" +
            "            <itemKey>MPBUMFF50LX275673</itemKey>\n" +
            "            <baseItem>\n" +
            "                <itemIdentifier>\n" +
            "                    <itemIdentifierTypeCode>ItemSequenceNumber</itemIdentifierTypeCode>\n" +
            "                    <itemIdentifierValue>1</itemIdentifierValue>\n" +
            "                </itemIdentifier>\n" +
            "                <itemIdentifier>\n" +
            "                    <itemIdentifierTypeCode>BuyerNumber</itemIdentifierTypeCode>\n" +
            "                    <itemIdentifierValue>MPBUMFF50LX275673</itemIdentifierValue>\n" +
            "                </itemIdentifier>\n" +
            "                <itemIdentifier>\n" +
            "                    <itemIdentifierTypeCode>ShortDescription</itemIdentifierTypeCode>\n" +
            "                    <itemIdentifierValue>MPBUMFF50LX275673</itemIdentifierValue>\n" +
            "                </itemIdentifier>\n" +
            "                <itemIdentifier>\n" +
            "                    <itemIdentifierTypeCode>IdBuyerColor</itemIdentifierTypeCode>\n" +
            "                    <itemIdentifierValue>PMYFU</itemIdentifierValue>\n" +
            "                </itemIdentifier>\n" +
            "                <itemDescriptor>\n" +
            "                    <itemDescriptorTypeCode>DescBuyerColor</itemDescriptorTypeCode>\n" +
            "                    <itemDescriptorValue>MAZDA ARCTIC WHITE</itemDescriptorValue>\n" +
            "                </itemDescriptor>\n" +
            "                <reference>\n" +
            "                    <type>VehicleOrderType</type>\n" +
            "                    <value>Stock</value>\n" +
            "                </reference>\n" +
            "                <reference>\n" +
            "                    <type>VehiclePriority</type>\n" +
            "                    <value>9-Normal</value>\n" +
            "                </reference>\n" +
            "                <reference>\n" +
            "                    <type>ModelYear</type>\n" +
            "                    <value>2020</value>\n" +
            "                </reference>\n" +
            "                <reference>\n" +
            "                    <type>VehicleLineDescription</type>\n" +
            "                    <value>RANGER</value>\n" +
            "                </reference>\n" +
            "                <reference>\n" +
            "                    <type>VehicleLineCode</type>\n" +
            "                    <value>T/KD</value>\n" +
            "                </reference>\n" +
            "                <reference>\n" +
            "                    <type>BodyStyle</type>\n" +
            "                    <value>MFF</value>\n" +
            "                </reference>\n" +
            "                <reference>\n" +
            "                    <type>Cab</type>\n" +
            "                    <value>DOUBLE CAB (CREW CAB)</value>\n" +
            "                </reference>\n" +
            "                <reference>\n" +
            "                    <type>MarketType</type>\n" +
            "                    <value>Affiliate</value>\n" +
            "                </reference>\n" +
            "                <reference>\n" +
            "                    <type>OrderingDealerCity</type>\n" +
            "                    <value>Mareeba</value>\n" +
            "                </reference>\n" +
            "                <reference>\n" +
            "                    <type>OrderingDealerState</type>\n" +
            "                    <value>STTBD</value>\n" +
            "                </reference>\n" +
            "                <reference>\n" +
            "                    <type>OrderingDealerCountry</type>\n" +
            "                    <value>AU</value>\n" +
            "                </reference>\n" +
            "                <reference>\n" +
            "                    <type>OriginEmissionsWindTunnelTesting</type>\n" +
            "                    <value>No</value>\n" +
            "                </reference>\n" +
            "                <reference>\n" +
            "                    <type>DestinationEmissionsWindTunnelTesting</type>\n" +
            "                    <value>No</value>\n" +
            "                </reference>\n" +
            "                <quantity>1</quantity>\n" +
            "                <unitOfMeasureCode>UN</unitOfMeasureCode>\n" +
            "            </baseItem>\n" +
            "            <originLocation>\n" +
            "                <name>MX</name>\n" +
            "                <longName>FTM Rayong AP</longName>\n" +
            "                <address>\n" +
            "                    <addressLine1>500/103 Moo 3 Tambol Tasit</addressLine1>\n" +
            "                    <addressLine2>Amphur Pluakdaeng</addressLine2>\n" +
            "                    <city>Rayong</city>\n" +
            "                    <stateOrProvince>12</stateOrProvince>\n" +
            "                    <postalCodeNumber>21140</postalCodeNumber>\n" +
            "                    <countryCode>TH</countryCode>\n" +
            "                    <locationQualifierCode>Custom</locationQualifierCode>\n" +
            "                    <locationCode>MX</locationCode>\n" +
            "                </address>\n" +
            "            </originLocation>\n" +
            "            <originGatewayLocation>\n" +
            "                <name>LCH</name>\n" +
            "                <longName>Port of Laem Chabang</longName>\n" +
            "                <address>\n" +
            "                    <addressLine1>444 Tarua Road Klongtoey</addressLine1>\n" +
            "                    <addressLine2></addressLine2>\n" +
            "                    <city>Laem Chabang</city>\n" +
            "                    <stateOrProvince>20</stateOrProvince>\n" +
            "                    <postalCodeNumber>10110</postalCodeNumber>\n" +
            "                    <countryCode>TH</countryCode>\n" +
            "                    <locationQualifierCode>UNLocationCode</locationQualifierCode>\n" +
            "                    <locationCode>THLCH</locationCode>\n" +
            "                </address>\n" +
            "            </originGatewayLocation>\n" +
            "            <destinationLocation>\n" +
            "                <name>12430-AU</name>\n" +
            "                <longName>Hansen Ford</longName>\n" +
            "                <address>\n" +
            "                    <addressLine1>279-283 Byrnes St</addressLine1>\n" +
            "                    <city>Mareeba</city>\n" +
            "                    <postalCodeNumber>4880</postalCodeNumber>\n" +
            "                    <countryCode>AU</countryCode>\n" +
            "                    <locationCode>12430</locationCode>\n" +
            "                </address>\n" +
            "            </destinationLocation>\n" +
            "            <destinationGatewayLocation>\n" +
            "                <name>BNE</name>\n" +
            "                <longName>Port of Brisbane</longName>\n" +
            "                <address>\n" +
            "                    <addressLine1>1 Sandpiper Avenue\n" +
            "                        , Locked Bag 1818\n" +
            "                    </addressLine1>\n" +
            "                    <addressLine2></addressLine2>\n" +
            "                    <city>Brisbane</city>\n" +
            "                    <stateOrProvince>QLD</stateOrProvince>\n" +
            "                    <postalCodeNumber>4178</postalCodeNumber>\n" +
            "                    <countryCode>AU</countryCode>\n" +
            "                    <locationQualifierCode>UNLocationCode</locationQualifierCode>\n" +
            "                    <locationCode>AUBNE</locationCode>\n" +
            "                </address>\n" +
            "            </destinationGatewayLocation>\n" +
            "        </orderItem>\n" +
            "    </orderDetail>\n" +
            "</Order>";
}
