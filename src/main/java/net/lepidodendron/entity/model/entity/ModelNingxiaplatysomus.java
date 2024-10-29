package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelNingxiaplatysomus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer jaw;

    public ModelNingxiaplatysomus() {
        this.textureWidth = 26;
        this.textureHeight = 26;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -8.0F, -1.0F, 2, 8, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 7, -1.0F, -7.0F, -2.0F, 2, 6, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 8, -1.0F, -5.0F, -3.0F, 2, 3, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 2.5F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 10, -1.5F, -7.1F, -6.0F, 2, 1, 2, 0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 15, -1.5F, -7.0F, -5.5F, 2, 1, 1, 0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 12, -1.5F, -6.5F, -6.0F, 2, 1, 2, 0.015F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.0F, -1.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 17, -1.5F, -4.5F, -1.5F, 2, 2, 1, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.0F, -1.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.829F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 4, -1.5F, -3.0F, 0.0F, 2, 3, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -8.0F, -1.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.8552F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 14, -1.5F, 0.0F, 0.0F, 2, 3, 1, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.25F, -8.0F, 0.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 12, 0.0F, -0.85F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 12, -0.5F, -0.85F, 0.0F, 1, 1, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -4.5F, 1.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 8, 0, -0.75F, -2.75F, -0.25F, 1, 5, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 8, 0, -0.25F, -2.75F, -0.25F, 1, 5, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.25F, 2.25F, 1.75F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5672F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 0, -0.5F, -0.1F, -2.75F, 1, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 0, -1.0F, -0.1F, -2.75F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.25F, 2.25F, 1.75F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.0036F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 0, -0.5F, -1.925F, -2.0F, 1, 2, 2, -0.01F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 16, -0.25F, -0.425F, -2.0F, 0, 1, 2, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 0, -1.0F, -1.925F, -2.0F, 1, 2, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.25F, -2.75F, 1.75F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6109F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 13, -0.5F, 0.0F, -2.0F, 1, 2, 2, -0.01F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 17, -0.25F, -0.25F, -2.0F, 0, 1, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 13, -1.0F, 0.0F, -2.0F, 1, 2, 2, -0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 17, 17, -0.5F, -1.75F, -0.25F, 1, 3, 1, -0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 13, 18, -0.5F, -1.25F, 0.25F, 1, 2, 1, -0.015F, false));
        this.body3.cubeList.add(new ModelBox(body3, 6, 0, -0.5F, -0.75F, 0.75F, 1, 1, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -0.01F, -0.75F, 1.25F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.75F, 0.75F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.8727F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 15, -0.5F, 0.0F, -1.25F, 1, 1, 2, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.25F, 0.75F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6109F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 19, -0.5F, -0.75F, -1.0F, 1, 2, 1, -0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.75F, 1.25F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5672F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 2, 19, 0.0F, 0.75F, -0.4F, 0, 3, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.75F, 1.25F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 19, 0.0F, -3.0F, 0.0F, 0, 3, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.75F, 0.0F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.9163F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 16, 0.0F, -0.25F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.25F, 0.0F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.0036F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 4, 11, 0.0F, -0.425F, 0.0F, 0, 1, 2, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.0F, -2.85F, -2.25F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.6981F, -0.1745F, 0.3927F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 6, 9, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pectoralfinright.addChild(bone);


        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.0F, -2.85F, -2.25F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.6981F, 0.1745F, -0.3927F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 6, 9, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pectoralfinleft.addChild(bone2);


        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, -0.6F, 0.75F);
        this.body.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.6981F, -0.1745F, 0.3927F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 0, 9, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, -0.6F, 0.75F);
        this.body.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.6981F, 0.1745F, -0.3927F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 0, 9, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, -4.5F, -3.0F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.2182F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 0, -1.5F, 0.0F, -0.75F, 2, 1, 1, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.body.offsetY = -0.14F;
        this.body.render(0.01F);
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
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(pectoralfinleft, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(pectoralfinright, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(pectoralfinright, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(pelvicfinleft, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(pelvicfinleft, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(pelvicfinright, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(pelvicfinright, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(body, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetX = -0.2F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
