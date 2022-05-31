package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTullimonstrum;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTullimonstrum extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer proboscis;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer bone7;
    private final AdvancedModelRenderer bone8;
    private final AdvancedModelRenderer bone9;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer upperjaw;

    private ModelAnimator animator;

    public ModelTullimonstrum() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -7.0F, -4.0F, 3, 3, 8, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 17, 18, -1.0F, -6.5F, -6.0F, 2, 2, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 12, 12, -3.5F, -7.5F, -3.0F, 7, 1, 1, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -6.0F, 4.0F);
        this.bone.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 9, 14, -1.0F, -1.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 19, 14, -1.0F, -0.5F, 0.0F, 2, 2, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 5, 0.0F, -2.0F, -2.0F, 0, 5, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 8, 20, -0.5F, -0.5F, 0.0F, 1, 2, 2, 0.0F, false));

        this.proboscis = new AdvancedModelRenderer(this);
        this.proboscis.setRotationPoint(0.0F, -6.0F, -6.0F);
        this.bone.addChild(proboscis);
        this.proboscis.cubeList.add(new ModelBox(proboscis, 24, 2, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.proboscis.addChild(bone2);
        this.bone2.cubeList.add(new ModelBox(bone2, 24, 4, -0.499F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone2.addChild(bone3);
        this.bone3.cubeList.add(new ModelBox(bone3, 24, 2, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone3.addChild(bone4);
        this.bone4.cubeList.add(new ModelBox(bone4, 24, 4, -0.499F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone4.addChild(bone5);
        this.bone5.cubeList.add(new ModelBox(bone5, 24, 2, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone5.addChild(bone6);
        this.bone6.cubeList.add(new ModelBox(bone6, 24, 4, -0.499F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone7 = new AdvancedModelRenderer(this);
        this.bone7.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone6.addChild(bone7);
        this.bone7.cubeList.add(new ModelBox(bone7, 24, 2, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone8 = new AdvancedModelRenderer(this);
        this.bone8.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone7.addChild(bone8);
        this.bone8.cubeList.add(new ModelBox(bone8, 24, 4, -0.499F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone9 = new AdvancedModelRenderer(this);
        this.bone9.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone8.addChild(bone9);
        this.bone9.cubeList.add(new ModelBox(bone9, 24, 2, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.bone9.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 4, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone9.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 0, -0.501F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bone.render(f5 * 0.4f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.bone.offsetY = 0.9F;

        EntityPrehistoricFloraTullimonstrum Tullimonstrum = (EntityPrehistoricFloraTullimonstrum) e;

        this.faceTarget(f3, f4, 2, bone);

        float speed = 0.32F;
        if (Tullimonstrum.getIsFeeding()) {
            speed = 0.15F;
        }
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        AdvancedModelRenderer[] Tail = {this.body1, this.body2, this.body3};
        AdvancedModelRenderer[] Trunk = {this.proboscis, this.bone2, this.bone3, this.bone4, this.bone5, this.bone6, this.bone7, this.bone8, this.bone9};

        this.chainWave(Tail, speed, 0.05F, -2, f2, 1);
        this.chainSwing(Tail, speed, 0.35F, -1.2, f2, 0.7F);

        this.chainWave(Trunk, speed * 0.3F, 0.04F, -1.5, f2, 0.2F);
        this.chainSwing(Trunk, speed * 0.4F, 0.06F, -2, f2, 0.8F);

        this.upperjaw.walk(speed * 0.5F, -0.2F, false, 0F, -0.2F, f2, 1F);
        this.lowerjaw.walk(speed * 0.5F, 0.2F, false, 0F, 0.2F, f2, 1F);

        if (!e.isInWater()) {
            this.bone.rotateAngleZ = (float) Math.toRadians(90);
            this.bone.offsetY = 0.7F;
            this.bob(bone, -speed, 5F, false, f2, 1);
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTullimonstrum e = (EntityPrehistoricFloraTullimonstrum) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.FEED_ANIMATION);
        animator.startKeyframe(20);
        animator.rotate(this.bone, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.proboscis, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.bone2, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.bone3, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.bone4, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.bone5, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.bone6, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.bone7, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.bone8, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.bone9, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(80);
        animator.resetKeyframe(20);

    }
}
