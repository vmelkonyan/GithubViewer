<#import "parts/common.ftlh" as c>
<@c.page>
    Repository details
    <div class="card">
        <div class="card-header">
            <label>Creator :</label> ${selectedItem.getOwner()}
        </div>
        <div class="card-body">
            <blockquote class="blockquote mb-0">

                <h5 class="card-title"><label>Create Date :</label> ${selectedItem.getCreateDate()?datetime.iso}</h5>
                <h5 class="card-title"><label>Update Date :</label> ${selectedItem.getUpdateDate()?datetime.iso}</h5>
                <#if selectedItem.getDescription()??>
                    <h5 class="card-title"><label>Description :</label> ${selectedItem.getDescription()}</h5>
                <#else >
                    Empty description
                </#if>
            </blockquote>
        </div>
    </div>
</@c.page>