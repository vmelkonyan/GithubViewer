<#import "parts/common.ftlh" as c>
<@c.page>
    Commits
    <div class="list-group">
        <#list commits as commit>
            <div class="card">
                <div class="card-header">
                    <h5 class="card-title"><label>Committer name
                            :</label> ${commit.getCommitDTO().getCommitterDTO().getName()}</h5>
                </div>
                <div class="card-body">
                    <blockquote class="blockquote mb-0">

                        <h5 class="card-title"><label>Commit Date
                                :</label> ${commit.getCommitDTO().getCommitterDTO().getDate()?datetime.iso}</h5>
                        <#if commit.getCommitDTO().getMessage()??>
                            <h5 class="card-title"><label>Commite message:</label>${commit.getCommitDTO().getMessage()}
                            </h5>
                        <#else >
                            <h5 class="card-title">No message</h5>
                        </#if>
                    </blockquote>
                </div>
            </div>
        </#list>
    </div>
</@c.page>