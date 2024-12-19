package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelWenzichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftpelvicfin;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightpelvicfin;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftpectoralfin;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightpectoralfin;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;

    public ModelWenzichthys() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 20.3469F, -3.8006F);
        this.head.cubeList.add(new ModelBox(head, 11, 0, -1.0F, -0.3119F, -2.9244F, 2, 2, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 16, 24, -1.0F, -0.3119F, -3.1244F, 2, 1, 1, 0.015F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.4509F, -1.7367F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 21, -1.0F, -0.5F, -0.6F, 2, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.3881F, -1.0244F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 27, -1.0F, -1.2F, -0.9F, 2, 1, 1, 0.005F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.2675F, -2.9672F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.9168F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 24, -1.0F, -0.7F, -0.3F, 2, 1, 1, 0.007F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0881F, -2.7244F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 17, -1.0F, -0.6F, -1.3F, 2, 1, 2, 0.005F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.24F, -2.707F);
        this.head.addChild(jaw);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 24, -1.0F, -0.6F, -0.6F, 2, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.0868F, -0.4924F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 14, -1.0F, -0.5F, -1.0F, 2, 1, 1, -0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.076F, -1.4263F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -0.3228F, 0.0269F, 2, 2, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 9, -1.0F, -1.4228F, 1.0269F, 2, 2, 5, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.3528F, 0.9288F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 4, -1.0F, -0.9F, -1.0F, 2, 2, 2, -0.005F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.7529F, 5.2139F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6981F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -0.6F, -0.8F, 0, 2, 2, 0.0F, false));

        this.leftpelvicfin = new AdvancedModelRenderer(this);
        this.leftpelvicfin.setRotationPoint(1.0F, 1.5173F, 5.2257F);
        this.body.addChild(leftpelvicfin);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftpelvicfin.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0865F, 0.0114F, -0.1304F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.rightpelvicfin = new AdvancedModelRenderer(this);
        this.rightpelvicfin.setRotationPoint(-1.0F, 1.5173F, 5.2257F);
        this.body.addChild(rightpelvicfin);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightpelvicfin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0865F, -0.0114F, 0.1304F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 11, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.leftpectoralfin = new AdvancedModelRenderer(this);
        this.leftpectoralfin.setRotationPoint(1.0F, 1.3539F, 1.5605F);
        this.body.addChild(leftpectoralfin);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftpectoralfin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3518F, 0.123F, -0.045F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 9, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.rightpectoralfin = new AdvancedModelRenderer(this);
        this.rightpectoralfin.setRotationPoint(-1.0F, 1.3539F, 1.5605F);
        this.body.addChild(rightpectoralfin);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightpectoralfin.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3518F, -0.123F, 0.045F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 9, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0041F, 5.9868F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 17, -0.75F, -0.4419F, -0.2113F, 1, 1, 3, 0.02F, false));
        this.body2.cubeList.add(new ModelBox(body2, 16, 12, -0.25F, -0.4419F, -0.2113F, 1, 1, 3, 0.02F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.7563F, 1.8957F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 6, 19, -0.25F, -0.6F, -2.0F, 1, 1, 3, 0.015F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 19, -0.75F, -0.6F, -2.0F, 1, 1, 3, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.7151F, 1.7239F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 22, -0.25F, -0.5F, -1.9F, 1, 1, 3, 0.015F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 9, -0.75F, -0.5F, -1.9F, 1, 1, 3, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 1.2429F, 2.327F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.7418F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 9, 1.0F, -0.7F, -0.1F, 0, 1, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.1283F, 2.6674F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 14, 6, -0.5F, -1.0F, -0.5F, 1, 2, 3, -0.007F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0013F, 1.7596F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 12, 14, 0.0F, -2.0F, -0.2F, 0, 4, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -2.0F;
        this.head.offsetX = -1.338F;
        this.head.rotateAngleY = (float)Math.toRadians(200);
        this.head.rotateAngleX = (float)Math.toRadians(8);
        this.head.rotateAngleZ = (float)Math.toRadians(-8);
        this.head.scaleChildren = true;
        float scaler = 1.63F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.offsetZ = -0.34F;
        this.head.offsetY = -0.18F;
        this.head.offsetX = -0.0F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.head.offsetY = -0.14F;
        this.head.offsetZ = 0.015F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(leftpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(rightpectoralfin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(rightpectoralfin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(leftpelvicfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(leftpelvicfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(rightpelvicfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(rightpelvicfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(head, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.head.rotateAngleZ = (float) Math.toRadians(90);
                this.head.offsetY = -0.1F;
                this.bob(head, -speed, 5F, false, f2, 1);
            }
        }
    }
}
