package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelWodnika extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer finright;
    private final AdvancedModelRenderer finleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer finright2;
    private final AdvancedModelRenderer finleft2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body4;

    private ModelAnimator animator;

    public ModelWodnika() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 19.0F, -6.0F);
        this.bone.cubeList.add(new ModelBox(bone, 9, 27, -2.0F, 0.0F, -6.0F, 4, 4, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 27, -1.5F, -1.0F, -6.25F, 3, 1, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.15F, -5.5F);
        this.bone.addChild(head);
        this.setRotateAngle(head, -0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 29, 18, -1.5F, 1.0F, -3.0F, 3, 2, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 29, -1.5F, 1.25F, -2.75F, 3, 1, 1, 0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.0F, -4.25F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.2043F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 27, -1.5F, -0.05F, -0.15F, 3, 2, 1, -0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2269F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 13, -1.5F, -1.125F, -2.9F, 3, 2, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3578F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.5F, -1.475F, -4.5F, 3, 1, 2, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 32, 0, -1.5F, 0.0F, -3.0F, 3, 1, 3, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 2.0F, -1.25F);
        this.bone.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -2.0F, 0.0F, 5, 5, 11, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 21, 0, 0.0F, -6.0F, 3.0F, 0, 4, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 31, -0.5F, -4.0F, 0.0F, 1, 4, 1, 0.0F, false));

        this.finright = new AdvancedModelRenderer(this);
        this.finright.setRotationPoint(-2.5F, 2.0F, 0.0F);
        this.body.addChild(finright);
        this.setRotateAngle(finright, 0.0F, 0.0F, 1.2217F);
        this.finright.cubeList.add(new ModelBox(finright, 0, 0, 0.0F, 0.0F, 0.0F, 0, 5, 4, 0.0F, false));

        this.finleft = new AdvancedModelRenderer(this);
        this.finleft.setRotationPoint(2.5F, 2.0F, 0.0F);
        this.body.addChild(finleft);
        this.setRotateAngle(finleft, 0.0F, 0.0F, -1.2217F);
        this.finleft.cubeList.add(new ModelBox(finleft, 0, 0, 0.0F, 0.0F, 0.0F, 0, 5, 4, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 5, 0.0F, -3.0F, 3.0F, 0, 2, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 14, 16, -2.0F, -1.75F, 0.0F, 4, 4, 7, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 36, -2.0F, -1.75F, -1.0F, 4, 4, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.0F, -9.0F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 0, -0.5F, -4.75F, 11.0F, 1, 2, 1, 0.0F, false));

        this.finright2 = new AdvancedModelRenderer(this);
        this.finright2.setRotationPoint(-1.0F, 2.0F, 1.5F);
        this.body2.addChild(finright2);
        this.setRotateAngle(finright2, 0.6981F, 0.0F, 0.829F);
        this.finright2.cubeList.add(new ModelBox(finright2, 14, 13, 0.0F, 0.0F, 0.0F, 0, 5, 3, 0.0F, false));

        this.finleft2 = new AdvancedModelRenderer(this);
        this.finleft2.setRotationPoint(1.0F, 2.0F, 1.5F);
        this.body2.addChild(finleft2);
        this.setRotateAngle(finleft2, 0.6981F, 0.0F, -0.829F);
        this.finleft2.cubeList.add(new ModelBox(finleft2, 14, 13, 0.0F, 0.0F, 0.0F, 0, 5, 3, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 21, 0, -1.0F, -1.5F, -0.75F, 2, 3, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.5F, 1.75F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 19, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 9, 0.0F, -8.5F, -0.75F, 0, 13, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bone.render(f5);
    }

    public void renderStaticWall(float f) {
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Acrolepis.offsetY = 1.0F;

        if (e instanceof EntityLiving) {
            if (((EntityLiving)e).isAIDisabled()) {
                return;
            }
        }

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still * 2, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(bone, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(bone, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(finleft, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.walk(finleft, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(finright, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.walk(finright, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(finleft2, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.walk(finleft2, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(finright2, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.walk(finright2, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);

        //this.flap(AnalFin, (float) (speed * 0.65), -0.28F, false, 0.4F, 0.1F, f2, 0.5F);
        //this.flap(DorsalFin, (float) (speed * 0.65), -0.18F, false, 0.4F, 0.05F, f2, 0.5F);

        if (!e.isInWater()) {
            this.bone.rotateAngleZ = (float) Math.toRadians(270);
            this.bone.offsetY = 0.20F;
            this.bone.offsetX = -0.20F;
            this.bob(bone, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.28F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.Head, 0,0,-0.5F);
        //animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

