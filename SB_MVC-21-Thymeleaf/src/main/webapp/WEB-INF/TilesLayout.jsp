<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"  %>

<table  width="100%"  height="100%"  rows="3" cols="2">
  <tr  height="5%" bgcolor="black">
    <td colspan="2"> <tiles:insertAttribute  name="headerContent"  />  </td>
  </tr>
  <tr  height="91%" width="100%">
      <td style="width: 10%;"> <tiles:insertAttribute  name="leftContent"  />  </td>
       <td style="width: 90%; align-content: left;"> <tiles:insertAttribute  name="bodyContent"  />  </td>
  </tr>
  <tr  height="4%">
    <td colspan="2"   bgcolor="black"> <tiles:insertAttribute  name="footerContent"  />  </td>
  </tr>
</table>

