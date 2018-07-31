package com.github.vincentrussell.json.datagenerator.functions.impl;

import com.github.vincentrussell.json.datagenerator.functions.Function;
import com.github.vincentrussell.json.datagenerator.functions.FunctionInvocation;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * random company name
 */
@Function(name = "countriesList")
@SuppressWarnings("checkstyle:linelength")
public class CountriesList {
  private static final String COUNTRIES_LIST =
      "{ \"AF\": \"Afghanistan\", \"AL\": \"Albania\", \"DZ\": \"Algeria\", \"AS\": \"American Samoa\", \"AD\": \"Andorra\", \"AO\": \"Angola\", \"AI\": \"Anguilla\", \"AQ\": \"Antarctica\", \"AG\": \"Antigua and Barbuda\", \"AR\": \"Argentina\", \"AM\": \"Armenia\", \"AW\": \"Aruba\", \"AU\": \"Australia\", \"AT\": \"Austria\", \"AZ\": \"Azerbaijan\", \"BS\": \"Bahamas\", \"BH\": \"Bahrain\", \"BD\": \"Bangladesh\", \"BB\": \"Barbados\", \"BY\": \"Belarus\", \"BE\": \"Belgium\", \"BZ\": \"Belize\", \"BJ\": \"Benin\", \"BM\": \"Bermuda\", \"BT\": \"Bhutan\", \"BO\": \"Bolivia\", \"BA\": \"Bosnia and Herzegovina\", \"BW\": \"Botswana\", \"BV\": \"Bouvet Island\", \"BR\": \"Brazil\", \"IO\": \"British Indian Ocean Territory\", \"BN\": \"Brunei Darussalam\", \"BG\": \"Bulgaria\", \"BF\": \"Burkina Faso\", \"BI\": \"Burundi\", \"KH\": \"Cambodia\", \"CM\": \"Cameroon\", \"CA\": \"Canada\", \"CV\": \"Cape Verde\", \"KY\": \"Cayman Islands\", \"CF\": \"Central African Republic\", \"TD\": \"Chad\", \"CL\": \"Chile\", \"CN\": \"China\", \"CX\": \"Christmas Island\", \"CC\": \"Cocos (Keeling Islands)\", \"CO\": \"Colombia\", \"KM\": \"Comoros\", \"CG\": \"Congo\", \"CK\": \"Cook Islands\", \"CR\": \"Costa Rica\", \"CI\": \"Cote D'Ivoire (Ivory Coast)\", \"HR\": \"Croatia (Hrvatska)\", \"CU\": \"Cuba\", \"CY\": \"Cyprus\", \"CZ\": \"Czech Republic\", \"DK\": \"Denmark\", \"DJ\": \"Djibouti\", \"DM\": \"Dominica\", \"DO\": \"Dominican Republic\", \"TP\": \"East Timor\", \"EC\": \"Ecuador\", \"EG\": \"Egypt\", \"SV\": \"El Salvador\", \"GQ\": \"Equatorial Guinea\", \"ER\": \"Eritrea\", \"EE\": \"Estonia\", \"ET\": \"Ethiopia\", \"FK\": \"Falkland Islands (Malvinas)\", \"FO\": \"Faroe Islands\", \"FJ\": \"Fiji\", \"FI\": \"Finland\", \"FR\": \"France\", \"FX\": \"France, Metropolitan\", \"GF\": \"French Guiana\", \"PF\": \"French Polynesia\", \"TF\": \"French Southern Territories\", \"GA\": \"Gabon\", \"GM\": \"Gambia\", \"GE\": \"Georgia\", \"DE\": \"Germany\", \"GH\": \"Ghana\", \"GI\": \"Gibraltar\", \"GR\": \"Greece\", \"GL\": \"Greenland\", \"GD\": \"Grenada\", \"GP\": \"Guadeloupe\", \"GU\": \"Guam\", \"GT\": \"Guatemala\", \"GN\": \"Guinea\", \"GW\": \"Guinea-Bissau\", \"GY\": \"Guyana\", \"HT\": \"Haiti\", \"HM\": \"Heard and McDonald Islands\", \"HN\": \"Honduras\", \"HK\": \"Hong Kong\", \"HU\": \"Hungary\", \"IS\": \"Iceland\", \"IN\": \"India\", \"ID\": \"Indonesia\", \"IR\": \"Iran\", \"IQ\": \"Iraq\", \"IE\": \"Ireland\", \"IL\": \"Israel\", \"IT\": \"Italy\", \"JM\": \"Jamaica\", \"JP\": \"Japan\", \"JO\": \"Jordan\", \"KZ\": \"Kazakhstan\", \"KE\": \"Kenya\", \"KI\": \"Kiribati\", \"KP\": \"Korea (North)\", \"KR\": \"Korea (South)\", \"KW\": \"Kuwait\", \"KG\": \"Kyrgyzstan\", \"LA\": \"Laos\", \"LV\": \"Latvia\", \"LB\": \"Lebanon\", \"LS\": \"Lesotho\", \"LR\": \"Liberia\", \"LY\": \"Libya\", \"LI\": \"Liechtenstein\", \"LT\": \"Lithuania\", \"LU\": \"Luxembourg\", \"MO\": \"Macau\", \"MK\": \"Macedonia\", \"MG\": \"Madagascar\", \"MW\": \"Malawi\", \"MY\": \"Malaysia\", \"MV\": \"Maldives\", \"ML\": \"Mali\", \"MT\": \"Malta\", \"MH\": \"Marshall Islands\", \"MQ\": \"Martinique\", \"MR\": \"Mauritania\", \"MU\": \"Mauritius\", \"YT\": \"Mayotte\", \"MX\": \"Mexico\", \"FM\": \"Micronesia\", \"MD\": \"Moldova\", \"MC\": \"Monaco\", \"MN\": \"Mongolia\", \"MS\": \"Montserrat\", \"MA\": \"Morocco\", \"MZ\": \"Mozambique\", \"MM\": \"Myanmar\", \"NA\": \"Namibia\", \"NR\": \"Nauru\", \"NP\": \"Nepal\", \"NL\": \"Netherlands\", \"AN\": \"Netherlands Antilles\", \"NC\": \"New Caledonia\", \"NZ\": \"New Zealand\", \"NI\": \"Nicaragua\", \"NE\": \"Niger\", \"NG\": \"Nigeria\", \"NU\": \"Niue\", \"NF\": \"Norfolk Island\", \"MP\": \"Northern Mariana Islands\", \"NO\": \"Norway\", \"OM\": \"Oman\", \"PK\": \"Pakistan\", \"PW\": \"Palau\", \"PA\": \"Panama\", \"PG\": \"Papua New Guinea\", \"PY\": \"Paraguay\", \"PE\": \"Peru\", \"PH\": \"Philippines\", \"PN\": \"Pitcairn\", \"PL\": \"Poland\", \"PT\": \"Portugal\", \"PR\": \"Puerto Rico\", \"QA\": \"Qatar\", \"RE\": \"Reunion\", \"RO\": \"Romania\", \"RU\": \"Russian Federation\", \"RW\": \"Rwanda\", \"GS\": \"S. Georgia and S. Sandwich Isls.\", \"KN\": \"Saint Kitts and Nevis\", \"LC\": \"Saint Lucia\", \"VC\": \"Saint Vincent and The Grenadines\", \"WS\": \"Samoa\", \"SM\": \"San Marino\", \"ST\": \"Sao Tome and Principe\", \"SA\": \"Saudi Arabia\", \"SN\": \"Senegal\", \"SC\": \"Seychelles\", \"SL\": \"Sierra Leone\", \"SG\": \"Singapore\", \"SK\": \"Slovak Republic\", \"SI\": \"Slovenia\", \"SB\": \"Solomon Islands\", \"SO\": \"Somalia\", \"ZA\": \"South Africa\", \"ES\": \"Spain\", \"LK\": \"Sri Lanka\", \"SH\": \"St. Helena\", \"PM\": \"St. Pierre and Miquelon\", \"SD\": \"Sudan\", \"SR\": \"Suriname\", \"SJ\": \"Svalbard and Jan Mayen Islands\", \"SZ\": \"Swaziland\", \"SE\": \"Sweden\", \"CH\": \"Switzerland\", \"SY\": \"Syria\", \"TW\": \"Taiwan\", \"TJ\": \"Tajikistan\", \"TZ\": \"Tanzania\", \"TH\": \"Thailand\", \"TG\": \"Togo\", \"TK\": \"Tokelau\", \"TO\": \"Tonga\", \"TT\": \"Trinidad and Tobago\", \"TN\": \"Tunisia\", \"TR\": \"Turkey\", \"TM\": \"Turkmenistan\", \"TC\": \"Turks and Caicos Islands\", \"TV\": \"Tuvalu\", \"UM\": \"US Minor Outlying Islands\", \"UG\": \"Uganda\", \"UA\": \"Ukraine\", \"AE\": \"United Arab Emirates\", \"UK\": \"United Kingdom\", \"US\": \"United States\", \"UY\": \"Uruguay\", \"UZ\": \"Uzbekistan\", \"VU\": \"Vanuatu\", \"VA\": \"Vatican City State (Holy See)\", \"VE\": \"Venezuela\", \"VN\": \"Viet Nam\", \"VG\": \"Virgin Islands (British)\", \"VI\": \"Virgin Islands (US)\", \"WF\": \"Wallis and Futuna Islands\", \"EH\": \"Western Sahara\", \"YE\": \"Yemen\", \"YU\": \"Yugoslavia\", \"ZR\": \"Zaire\", \"ZM\": \"Zambia\", \"ZW\": \"Zimbabwe\" }";
  private static final JsonObject COUNTRIES_LIST_JSON =
      new JsonParser().parse(COUNTRIES_LIST).getAsJsonObject();

  /**
   * get all countries list
   * @return countries list as string
   */
  @FunctionInvocation
  public String getCountriesList() {
    return COUNTRIES_LIST;
  }

  /**
   * get countries list based on countri codes
   * @param countryCodes country codes
   * @return countries list as string
   */
  @FunctionInvocation
  public String getCountriesList(final String... countryCodes) {
    if (countryCodes != null && countryCodes.length != 0) {
      if (countryCodes.length == 1) {
        return COUNTRIES_LIST_JSON.get(countryCodes[0]).getAsString();
      }

      JsonObject jsonObjectToReturn = new JsonObject();
      for (String countryCode : countryCodes) {
        if (COUNTRIES_LIST_JSON.has(countryCode)) {
          jsonObjectToReturn.add(countryCode, COUNTRIES_LIST_JSON.get(countryCode));
        }
      }

      return jsonObjectToReturn.toString();
    }

    return null;
  }
}

