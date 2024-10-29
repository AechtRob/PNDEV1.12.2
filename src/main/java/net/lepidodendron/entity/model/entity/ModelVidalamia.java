package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraVidalamia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVidalamia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer dorsalfin1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer dorsalfin2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer dorsalfin3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer dorsalfin4;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer dorsalfin5;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer jaw;

    private ModelAnimator animator;

    public ModelVidalamia() {
        this.textureWidth = 36;
        this.textureHeight = 36;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(1.0F, 22.0F, -2.5F);
        this.head.cubeList.add(new ModelBox(head, 14, 19, -3.0F, -2.25F, -3.25F, 4, 4, 3, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 28, -3.35F, -2.25F, -3.25F, 1, 4, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 25, 19, -3.0F, -1.4F, -5.5F, 4, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 28, 0.35F, -2.25F, -3.25F, 1, 4, 3, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.1F, -2.95F, -6.2F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3054F, -0.3927F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, 2.0F, -2.0F, 1, 0, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.65F, -0.925F, -6.4F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5236F, 0.4189F, 0.0873F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 28, -1.0F, -0.092F, -0.0169F, 1, 1, 2, 0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.225F, 0.025F, -5.05F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.1134F, 0.1309F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 28, -1.0F, -0.092F, -0.0169F, 1, 1, 2, 0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.1F, -2.95F, -6.2F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3054F, 0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, 2.0F, -2.0F, 1, 0, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -2.2F, -5.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 5, 28, -2.0F, 1.0F, -2.0F, 3, 1, 1, 0.005F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.8F, -5.5F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 0, -3.0F, 1.0F, -1.0F, 4, 2, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 28, -2.5F, 1.0F, -2.0F, 3, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.225F, 0.025F, -5.05F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2182F, -0.1134F, -0.1309F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 28, 0.0F, -0.092F, -0.0169F, 1, 1, 2, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.65F, -0.925F, -6.4F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5236F, -0.4189F, -0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 28, 0.0F, -0.092F, -0.0169F, 1, 1, 2, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.175F, -3.9F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 5, -2.0F, 1.0F, -2.0F, 3, 1, 2, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.25F, -3.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 0, -3.0F, -1.0F, -2.0F, 4, 3, 2, -0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-3.0F, 0.75F, -0.25F);
        this.head.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.3054F, -0.3491F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 16, 23, 0.0F, -0.5F, 0.0F, 0, 2, 3, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.0F, 0.75F, -0.25F);
        this.head.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.3054F, 0.3491F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 16, 23, 0.0F, -0.5F, 0.0F, 0, 2, 3, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(-1.0F, -0.25F, -0.25F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 9, -2.0F, -2.0F, -0.5F, 4, 4, 5, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, -2.0F, -0.5F, 4, 4, 5, 0.0F, false));

        this.dorsalfin1 = new AdvancedModelRenderer(this);
        this.dorsalfin1.setRotationPoint(0.0F, -1.85F, 1.5F);
        this.body2.addChild(dorsalfin1);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.25F, 0.0F);
        this.dorsalfin1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 9, 0.99F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfin2 = new AdvancedModelRenderer(this);
        this.dorsalfin2.setRotationPoint(0.0F, -1.85F, 3.5F);
        this.body2.addChild(dorsalfin2);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.35F, 0.0F);
        this.dorsalfin2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 7, 1.01F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.75F, 2.0F, 1.05F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.6545F, -0.0873F, 0.3491F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 13, 9, 0.0F, -2.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.75F, 2.0F, 1.05F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.6545F, 0.0873F, -0.3491F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 13, 9, 0.0F, -2.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 13, 4, -1.5F, -1.7064F, -0.9981F, 3, 3, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.2936F, 3.2519F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.0908F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, -3.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 1.7936F, 0.0019F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 13, -2.0F, -1.0F, -1.0F, 3, 1, 5, -0.01F, false));

        this.dorsalfin3 = new AdvancedModelRenderer(this);
        this.dorsalfin3.setRotationPoint(0.0F, -1.5564F, 0.8019F);
        this.body3.addChild(dorsalfin3);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 0.2F, -0.1F);
        this.dorsalfin3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 23, 0.99F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfin4 = new AdvancedModelRenderer(this);
        this.dorsalfin4.setRotationPoint(0.0F, -1.5564F, 1.8019F);
        this.body3.addChild(dorsalfin4);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 0.325F, 0.75F);
        this.dorsalfin4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 21, 1.01F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfin5 = new AdvancedModelRenderer(this);
        this.dorsalfin5.setRotationPoint(0.0F, -1.4564F, 3.8019F);
        this.body3.addChild(dorsalfin5);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.35F, 0.75F);
        this.dorsalfin5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 21, 0.99F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0436F, 4.0019F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0873F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.3564F, 0.0019F);
        this.body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 25, 12, -1.0F, -3.0F, -1.0F, 2, 3, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.1436F, 2.0019F);
        this.body4.addChild(body5);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 1.4F, 0.5F);
        this.body5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 26, 0.0F, -1.0F, -1.0F, 1, 1, 4, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.9F, 0.5F);
        this.body5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 22, 0.0F, -2.0F, -1.0F, 1, 2, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 2.5F, 1.5F);
        this.body5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 11, 0.0F, -5.0F, -1.0F, 0, 5, 7, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-1.0F, 0.75F, -3.25F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.3054F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 23, -1.5F, 0.0F, -3.65F, 3, 1, 4, -0.015F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 13, 1, -1.4F, -2.0F, -2.0F, 0, 2, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 13, 1, 1.4F, -2.0F, -2.0F, 0, 2, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.head.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.offsetX = -0.14F;
        this.head.offsetY = -0.19F;
        this.head.offsetZ = 0.06F;
        this.head.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.head.offsetY = -0.18F;
        this.head.render(0.01F);
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

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};
        AdvancedModelRenderer[] dorsal = {this.dorsalfin1, this.dorsalfin2, this.dorsalfin3, this.dorsalfin4, this.dorsalfin5};
        ((EntityPrehistoricFloraVidalamia)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.223F;
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
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.chainFlap(dorsal, speed * still, 0.3F * still, -3.5, f2, 1F);
            this.swing(head, speed, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(head, speed, 0.05F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.head.rotateAngleZ = (float) Math.toRadians(90);
            //this.head.offsetY = -0.1F;
            this.bob(head, -speed * 1.9F, 2.5F, false, f2, 1);
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
        animator.rotate(this.jaw, (float) Math.toRadians(32.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

