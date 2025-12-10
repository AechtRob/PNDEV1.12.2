package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelWakinoichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer jaw;

    public ModelWakinoichthys() {
        this.textureWidth = 40;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 17.5F, -7.0F);
        this.body.cubeList.add(new ModelBox(body, 14, 0, -1.0F, -1.15F, 3.4F, 2, 2, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 26, -1.15F, -0.75F, 2.45F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 26, 0.15F, -0.75F, 2.45F, 1, 2, 2, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 27, -1.0F, -0.8F, 0.6F, 2, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.05F, 0.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 6, -1.0F, -1.0F, -1.0F, 2, 1, 4, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.525F, 1.875F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 11, -1.0F, -2.0F, -1.425F, 2, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.25F, -0.3F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6545F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 4, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.825F, 5.4F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, -1.0F, -2.0F, -3.0F, 2, 2, 5, -0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-0.975F, 1.35F, 5.4F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.2182F, -0.2618F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 16, 22, 0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(0.975F, 1.35F, 5.4F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.2182F, 0.2618F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 16, 22, 0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.4F, 7.4F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.0F, -1.5F, -0.5F, 2, 3, 5, -0.02F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.975F, 1.15F, 2.1F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.3491F, -0.2182F, 0.0F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 18, 27, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.975F, 1.15F, 2.1F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.3491F, 0.2182F, 0.0F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 18, 27, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.25F, 4.45F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 8, 21, -0.75F, -0.85F, -0.55F, 1, 2, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 8, 21, -0.25F, -0.85F, -0.55F, 1, 2, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.725F, 1.55F, 0.475F);
        this.body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 22, -1.0F, -1.0F, -1.0F, 1, 1, 3, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 22, -1.45F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.725F, -0.15F, 0.375F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0829F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 0, -1.0F, -1.0F, -1.0F, 1, 1, 3, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 0, -1.45F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.15F, 2.45F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 14, 11, -0.6F, -0.6F, -0.5F, 1, 1, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 14, 11, -0.4F, -0.6F, -0.5F, 1, 1, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.575F, 0.0F, 0.5F);
        this.body4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 16, -1.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 16, -1.15F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.575F, 1.0F, 0.5F);
        this.body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 15, -1.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 15, -1.15F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.475F, 2.6F, 1.45F);
        this.body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 16, 0.475F, -2.0F, -1.0F, 0, 2, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.475F, -0.25F, 1.15F);
        this.body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.8727F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 27, 0.475F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.025F, 0.0F, 3.5F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 24, 26, -0.525F, -0.6F, -0.25F, 1, 1, 2, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 6, 27, -0.025F, -2.1F, 5.25F, 0, 4, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 20, -0.025F, -1.6F, 1.25F, 0, 3, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.75F, 0.6F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.6109F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 7, -1.0F, -0.575F, -1.8F, 2, 1, 2, -0.02F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0.05F;
        this.body.offsetY = -0.23F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(jaw, -0.3491F, 0.0F, 0.0F);
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.6F;
        this.body.offsetX = -0.04F;
        this.body.offsetZ = 0.0F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.2F;
        this.body.offsetX = 1.6F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 4.2F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        this.body.offsetY = 0F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.2F, -3, f2, 1);
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralfinright, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinright, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pelvicfinleft, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(pelvicfinleft, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.walk(pelvicfinright, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(pelvicfinright, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.25F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
