package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraNipponamia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelNipponamia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
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
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer dorsalfin3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer dorsalfin4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer dorsalfin5;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer dorsalfin6;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer dorsalfin2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer dorsalfin1;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer jaw;

    private ModelAnimator animator;

    public ModelNipponamia() {
        this.textureWidth = 40;
        this.textureHeight = 48;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 20.3F, -3.1F);
        this.body.cubeList.add(new ModelBox(body, 0, 8, -2.0F, -2.4F, -0.4F, 4, 4, 3, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 29, -2.25F, -2.4F, -0.4F, 1, 4, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 29, 1.25F, -2.4F, -0.4F, 1, 4, 3, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -4.35F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, -0.3491F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 5, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.775F, -0.45F, -2.9F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 0, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.1F, -1.25F, -4.4F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4363F, 0.3927F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 36, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.775F, -0.45F, -2.9F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, -0.0436F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 0, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 1.3F, -2.05F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 10, -2.0F, -3.0F, 0.0F, 3, 3, 2, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.1F, -1.25F, -4.4F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4363F, -0.3927F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 36, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0F, -4.35F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.3491F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 5, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.25F, -0.05F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 33, -1.0F, -4.0F, -3.0F, 2, 2, 1, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.325F, -0.3F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5672F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 20, -1.0F, -3.0F, -3.0F, 2, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 0.0F, 1.625F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 27, -3.0F, -3.0F, -2.0F, 4, 2, 3, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 0.45F, -0.8F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 31, -2.0F, -2.7F, -1.9F, 3, 1, 1, 0.01F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 5, -2.0F, -3.0F, -2.0F, 3, 2, 3, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.25F, 1.6F, 1.7F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.6545F, 0.0F, 0.6981F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 6, 36, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.25F, 1.6F, 1.7F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.6545F, 0.0F, -0.6981F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 6, 36, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.65F, 2.6F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 14, 8, -2.0F, -1.725F, -0.5F, 4, 4, 3, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, -1.525F, 0.5F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 27, -3.0F, -1.0F, -1.0F, 4, 1, 3, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.225F, 2.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -2.0F, -2.0F, -0.5F, 4, 4, 4, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, -1.35F, 1.5F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0262F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 0, -3.0F, -1.0F, -2.0F, 4, 1, 4, -0.02F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 2.4F, 1.5F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0524F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 15, -3.0F, -1.0F, -2.0F, 4, 1, 4, -0.02F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 2.225F, 2.35F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.7418F, 0.0F, 0.6981F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 8, 29, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 2.225F, 2.35F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.7418F, 0.0F, -0.6981F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 8, 29, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.1F, 3.5F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 16, 15, -1.5F, -1.5F, -0.75F, 3, 3, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -1.075F, 0.25F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1134F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 22, -2.0F, -1.0F, -1.0F, 3, 1, 4, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 2.0F, 1.35F);
        this.body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 22, -2.0F, -1.0F, -2.0F, 3, 1, 4, -0.01F, false));

        this.dorsalfin3 = new AdvancedModelRenderer(this);
        this.dorsalfin3.setRotationPoint(0.0F, -2.025F, 0.55F);
        this.body4.addChild(dorsalfin3);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.775F, -0.125F);
        this.dorsalfin3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 36, 1.01F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfin4 = new AdvancedModelRenderer(this);
        this.dorsalfin4.setRotationPoint(0.0F, -1.875F, 1.75F);
        this.body4.addChild(dorsalfin4);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 0.825F, 0.2F);
        this.dorsalfin4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 36, 0.99F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfin5 = new AdvancedModelRenderer(this);
        this.dorsalfin5.setRotationPoint(0.0F, -1.675F, 3.425F);
        this.body4.addChild(dorsalfin5);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, 0.825F, 0.025F);
        this.dorsalfin5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 36, 1.01F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.15F, 3.25F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 8, 32, -1.0F, -0.975F, -0.25F, 2, 2, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.475F, 0.725F);
        this.body5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 30, 19, -1.0F, -1.0F, -1.0F, 2, 1, 2, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.525F, 0.85F);
        this.body5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 16, 5, -1.0F, -1.0F, -1.0F, 2, 1, 2, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 2.6F, 1.75F);
        this.body5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6545F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 10, 36, 0.99F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfin6 = new AdvancedModelRenderer(this);
        this.dorsalfin6.setRotationPoint(0.0F, -1.425F, 1.15F);
        this.body5.addChild(dorsalfin6);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, 0.925F, 0.375F);
        this.dorsalfin6.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 14, 36, 0.99F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.025F, 1.75F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 24, 31, -0.5F, -1.35F, -0.8F, 1, 2, 3, 0.01F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 20, 0.0F, -2.35F, 1.55F, 0, 4, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 1.3F, 0.25F);
        this.body6.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0873F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 16, 32, 0.0F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.dorsalfin2 = new AdvancedModelRenderer(this);
        this.dorsalfin2.setRotationPoint(0.0F, -2.325F, 2.475F);
        this.body3.addChild(dorsalfin2);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 0.725F, -0.175F);
        this.dorsalfin2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0436F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 36, 0.99F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfin1 = new AdvancedModelRenderer(this);
        this.dorsalfin1.setRotationPoint(0.0F, -2.325F, 0.975F);
        this.body3.addChild(dorsalfin1);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, 0.125F, 0.775F);
        this.dorsalfin1.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0436F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 24, 6, 1.01F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.85F, -1.95F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.2182F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 15, -1.0F, -0.55F, -2.9F, 2, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 36, -0.9F, -2.3F, -1.4F, 0, 2, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 36, 0.9F, -2.3F, -1.4F, 0, 2, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.3F;
        this.body.offsetX = 0.268F;
        this.body.rotateAngleY = (float)Math.toRadians(242);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 1.400F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0.03F;
        this.body.offsetY = -0.22F;
        this.body.offsetZ = -0.215F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.body.render(0.01F);
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
//        this.resetToDefaultPose();

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6};
        AdvancedModelRenderer[] dorsal = {this.dorsalfin1, this.dorsalfin2, this.dorsalfin3, this.dorsalfin4, this.dorsalfin5, this.dorsalfin6};

        ((EntityPrehistoricFloraNipponamia)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.5F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.01F * still, -0, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.07F * still, -0, f2, 0.5F * still);
            this.chainFlap(dorsal, speed * still, 0.4F * still, 4.5, f2, 1F);
            this.swing(body, speed, 0.05F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.05F, true, 0, 0, f2, 0.5F);
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
            this.body.rotateAngleZ = (float) Math.toRadians(90);
//            this.body.offsetY = 1.3F;
//            this.body.offsetX = 1.1F;
            this.bob(body, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

