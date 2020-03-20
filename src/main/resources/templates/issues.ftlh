<#import "parts/common.ftlh" as c>
<@c.page>
    Issues
    <div class="list-group">
        <#list issues as issue>
            <div class="card">
                <div class="card-header">
                    <h5 class="card-title"><label>Issue title :</label> ${issue.getTitle()}</h5>
                </div>
                <div class="card-body">
                    <blockquote class="blockquote mb-0">

                        <h5 class="card-title"><label>Create Date :</label> ${issue.getCreatedAt()?datetime.iso}</h5>
                        <h5 class="card-title"><label>Update Date :</label> ${issue.getUpdatedAt()?datetime.iso}</h5>
                        <#if issue.getClosedAt()??>
                            <h5 class="card-title"><label>Close date:</label>${issue.getClosedAt()?datetime.iso}</h5>
                        <#else >
                            <h5 class="card-title"><label>Close date:</label> In Progress</h5>
                        </#if>
                    </blockquote>
                </div>
            </div>
        <#else >
            No issues
        </#list>
    </div>
</@c.page>