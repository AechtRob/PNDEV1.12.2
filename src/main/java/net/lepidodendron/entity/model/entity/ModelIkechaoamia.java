package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraIkechaoamia;
import net.lepidodendron.entity.EntityPrehistoricFloraVidalamia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelIkechaoamia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer dorsalfin1;
    private final AdvancedModelRenderer dorsalfin2;
    private final AdvancedModelRenderer dorsalfin3;
    private final AdvancedModelRenderer dorsalfin4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer pelvicfihright;
    private final AdvancedModelRenderer pelvicfihleft;
    private final AdvancedModelRenderer jaw;

    private ModelAnimator animator;

    public ModelIkechaoamia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, -5.0F);
        this.base.cubeList.add(new ModelBox(base, 24, 6, -1.25F, -2.5F, -2.1F, 1, 2, 2, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 22, 14, -1.0F, -2.35F, -3.925F, 2, 1, 3, 0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 24, 6, 0.25F, -2.5F, -2.1F, 1, 2, 2, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.6F, -3.925F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3927F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 13, 0.0F, 0.0F, -0.7F, 1, 0, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -2.35F, -3.925F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3927F, 0.1396F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 24, -1.0F, -0.1F, 0.6F, 1, 1, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.275F, -1.3F, -2.1F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1571F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 24, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.275F, -1.3F, -2.1F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1571F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 24, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.6F, -3.925F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3927F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 13, -1.0F, 0.0F, -0.7F, 1, 0, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -2.35F, -3.925F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, -0.1396F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 24, 0.0F, -0.1F, 0.6F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.075F, -1.925F);
        this.base.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 0, -1.0F, 0.0F, -0.2F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.35F, -3.925F);
        this.base.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 21, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.0F, -0.575F, -0.175F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.4363F, -0.3491F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 22, 18, 0.0F, -0.5F, -0.75F, 0, 1, 4, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.0F, -0.575F, -0.175F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.4363F, 0.3491F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 22, 18, 0.0F, -0.5F, -0.75F, 0, 1, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.5F, -0.35F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -1.5F, -0.65F, 2, 3, 5, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.5F, -0.65F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0698F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 8, -1.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.25F, 4.35F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 14, -0.75F, -1.1F, -0.75F, 1, 2, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 14, -0.25F, -1.1F, -0.75F, 1, 2, 5, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.725F, -0.4F, 0.4F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 23, -1.0F, -1.0F, -1.0F, 1, 1, 3, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 23, -1.45F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.725F, 1.5F, 0.6F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 19, -1.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 19, -1.45F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.15F, 3.4F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.0472F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 24, 0.0F, -1.0F, 0.0F, 0, 3, 1, 0.0F, false));

        this.dorsalfin1 = new AdvancedModelRenderer(this);
        this.dorsalfin1.setRotationPoint(0.0F, -1.425F, 0.25F);
        this.body2.addChild(dorsalfin1);
        this.dorsalfin1.cubeList.add(new ModelBox(dorsalfin1, 4, 25, 0.0F, -0.675F, -0.25F, 0, 1, 1, 0.0F, false));

        this.dorsalfin2 = new AdvancedModelRenderer(this);
        this.dorsalfin2.setRotationPoint(0.0F, -1.325F, 1.25F);
        this.body2.addChild(dorsalfin2);
        this.dorsalfin2.cubeList.add(new ModelBox(dorsalfin2, 10, 21, 0.0F, -1.275F, -0.25F, 0, 2, 1, 0.0F, false));

        this.dorsalfin3 = new AdvancedModelRenderer(this);
        this.dorsalfin3.setRotationPoint(0.0F, -1.075F, 2.25F);
        this.body2.addChild(dorsalfin3);
        this.dorsalfin3.cubeList.add(new ModelBox(dorsalfin3, 0, 25, 0.0F, -1.375F, -0.25F, 0, 2, 1, 0.0F, false));

        this.dorsalfin4 = new AdvancedModelRenderer(this);
        this.dorsalfin4.setRotationPoint(0.0F, -1.075F, 3.25F);
        this.body2.addChild(dorsalfin4);
        this.dorsalfin4.cubeList.add(new ModelBox(dorsalfin4, 24, 10, 0.0F, -0.975F, -0.25F, 0, 1, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.1F, 4.25F);
        this.body2.addChild(body3);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.9F, 0.1F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 9, 0.0F, -1.0F, -0.9F, 1, 1, 4, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.75F, 2.95F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 0, 0.0F, -4.0F, -1.0F, 0, 4, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.1F, 0.4F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 14, 0.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.pelvicfihright = new AdvancedModelRenderer(this);
        this.pelvicfihright.setRotationPoint(-0.375F, 1.4F, 0.85F);
        this.body2.addChild(pelvicfihright);
        this.setRotateAngle(pelvicfihright, 0.7854F, 0.0F, 0.2618F);
        this.pelvicfihright.cubeList.add(new ModelBox(pelvicfihright, 2, 25, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.pelvicfihleft = new AdvancedModelRenderer(this);
        this.pelvicfihleft.setRotationPoint(0.375F, 1.4F, 0.85F);
        this.body2.addChild(pelvicfihleft);
        this.setRotateAngle(pelvicfihleft, 0.7854F, 0.0F, -0.2618F);
        this.pelvicfihleft.cubeList.add(new ModelBox(pelvicfihleft, 2, 25, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.575F, -1.925F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.3491F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 3, -1.0F, -0.5F, -2.05F, 2, 1, 2, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.base.offsetX = -0.14F;
        this.base.offsetY = -0.19F;
        this.base.offsetZ = 0.06F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.base.offsetY = -0.18F;
        this.base.render(0.01F);
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

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3};
        AdvancedModelRenderer[] dorsal = {this.dorsalfin1, this.dorsalfin2, this.dorsalfin3, this.dorsalfin4};
        ((EntityPrehistoricFloraIkechaoamia)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.15F * still, -0.85, f2, 0.5F * still);
            this.chainFlap(dorsal, speed * still, 0.35F * still, -2.5, f2, 1F);
            this.swing(base, speed, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(base, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfihleft, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfihleft, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfihright, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfihright, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            //this.base.offsetY = -0.1F;
            this.bob(base, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

