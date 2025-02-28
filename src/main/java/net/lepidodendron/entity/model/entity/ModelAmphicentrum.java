package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAmphicentrum extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;

    public ModelAmphicentrum() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 13.0F, -4.0F);
        this.head.cubeList.add(new ModelBox(head, 38, 16, -1.5F, -5.0F, 0.0F, 3, 7, 3, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.45F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 26, -2.0F, -1.0F, -4.0F, 3, 1, 3, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -1.2F, 1.575F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 13, -2.0F, -1.0F, -4.0F, 3, 1, 1, 0.03F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -0.95F, 0.925F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4363F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 0, -2.0F, -2.0F, -4.0F, 3, 2, 2, 0.02F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.2F, -0.175F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 9, -2.0F, -2.0F, -4.0F, 3, 2, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -6.75F, 1.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.6545F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 0, -2.0F, 0.0F, -5.0F, 3, 3, 6, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 2.0F, 0.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6981F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 0, -2.0F, -2.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.85F, 2.0F, 1.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.2182F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 39, -1.0F, -7.0F, -1.0F, 1, 7, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.85F, 2.0F, 1.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2182F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 39, 0.0F, -7.0F, -1.0F, 1, 7, 3, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.95F, 1.5F, 1.5F);
        this.head.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.1309F, -0.3491F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 40, 6, 0.0F, -2.25F, -0.25F, 0, 3, 4, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.95F, 1.5F, 1.5F);
        this.head.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.1309F, 0.3491F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 40, 6, 0.0F, -2.25F, -0.25F, 0, 3, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.45F, 3.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -5.0F, -0.75F, 4, 10, 7, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 5.8F, -0.1F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6109F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 24, -2.0F, -5.0F, -1.0F, 3, 5, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -1.85F, 1.925F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4625F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 10, -2.0F, -5.0F, -1.0F, 3, 5, 7, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.25F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 16, 14, 0.0F, -11.5F, -1.75F, 0, 8, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 9, 0.0F, 3.5F, -1.75F, 0, 9, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 26, -1.5F, -4.0F, -0.75F, 3, 8, 5, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.65F, 2.75F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.829F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 35, -1.0F, -7.0F, -1.0F, 2, 7, 3, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 3.1F, 3.7F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6545F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 35, -1.0F, 0.0F, -3.0F, 2, 8, 4, -0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.25F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 8, 39, -1.0F, -2.0F, -1.0F, 2, 4, 3, -0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 24, 0.0F, -6.0F, 0.0F, 0, 4, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 11, 24, 0.0F, 1.5F, 0.0F, 0, 3, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 1.9F, 2.5F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.7418F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, 0.5F, -2.5F, 1, 3, 2, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.5F, 0.5F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 45, 0.0F, -4.0F, -1.0F, 1, 4, 3, -0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 35, 45, -0.5F, -2.25F, -0.5F, 1, 4, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 16, 25, 0.0F, -6.25F, 1.5F, 0, 11, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -3.5F, 4.5F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.7418F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 30, 0.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.75F, 2.5F);
        this.body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.7418F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 42, 0.0F, -2.0F, -1.0F, 1, 2, 4, 0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 8.1F, -1.8F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.48F, 0.0F, 0.1745F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -4.25F, 6.25F);
        this.pelvicfinright.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.6545F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 2, 1.0F, 7.0F, -3.0F, 0, 1, 3, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 8.1F, -1.8F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.48F, 0.0F, -0.1745F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, -4.25F, 6.25F);
        this.pelvicfinleft.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6545F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 2, -1.0F, 7.0F, -3.0F, 0, 1, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.45F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 5, -1.0F, 0.0F, -3.75F, 2, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 1.325F, -1.85F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3491F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 34, 0, -0.5F, -1.0F, -1.0F, 2, 1, 4, -0.01F, false));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.head.offsetZ = -0.23F;
        this.head.offsetY = -0.14F;
        this.head.offsetX = -0.08F;
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.head.offsetZ = -0.02F;
        this.head.offsetY = -0.05F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -1.0F;
        this.head.offsetX = 0.7F;
        this.head.rotateAngleY = (float)Math.toRadians(231);
        this.head.rotateAngleX = (float)Math.toRadians(8);
        this.head.rotateAngleZ = (float)Math.toRadians(-8);
        this.head.scaleChildren = true;
        float scaler = 1.83F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
        resetToDefaultPose();

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
        //this.head.offsetY = 0.4F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.1F, -1.5, f2, 1);
            this.swing(head, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.5F, true, 0, 0, f2, 1);
            this.flap(pelvicfinright, speed * 1.5F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(pelvicfinleft, speed * 1.5F, -0.75F, false, 0F, 0.3F, f2, 1F);
            this.flap(pectoralfinright, speed * 1.5F, 0.1F, false, 0F, -0.1F, f2, 1F);
            this.flap(pectoralfinleft, speed * 1.5F, -0.1F, false, 0F, 0.1F, f2, 1F);
            this.swing(pectoralfinright, speed * 1.5F, 0.3F, false, 0F, -0.2F, f2, 1F);
            this.swing(pectoralfinleft, speed * 1.5F, -0.3F, false, 0F, 0.2F, f2, 1F);
            if (!e.isInWater()) {
                this.head.rotateAngleZ = (float) Math.toRadians(90);
                this.head.offsetY = 0.6F;
                this.bob(head, -speed, 5F, false, f2, 1);
            }
        }
    }
}
