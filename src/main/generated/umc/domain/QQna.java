package umc.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQna is a Querydsl query type for Qna
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQna extends EntityPathBase<Qna> {

    private static final long serialVersionUID = 951842461L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQna qna = new QQna("qna");

    public final umc.domain.common.QBaseEntity _super = new umc.domain.common.QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMember member;

    public final StringPath subject = createString("subject");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QQna(String variable) {
        this(Qna.class, forVariable(variable), INITS);
    }

    public QQna(Path<? extends Qna> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQna(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQna(PathMetadata metadata, PathInits inits) {
        this(Qna.class, metadata, inits);
    }

    public QQna(Class<? extends Qna> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}

