package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAlienum extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;

    public ModelAlienum() {
        this.textureWidth = 32;
        this.textureHeight = 25;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.25F, 2.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 12, -1.0F, -0.75F, -8.0F, 2, 4, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 13, 10, -1.5F, -0.25F, -7.0F, 3, 3, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 8, -0.5F, -0.75F, -0.5F, 1, 2, 1, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.75F, -8.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2443F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 9, -1.0F, 2.0F, 0.5F, 2, 1, 1, 0.001F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.0F, 0.0F, 0.0F, 2, 3, 1, -0.002F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 3.3028F, 1.0621F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 1, -1.0F, 0.0F, -8.0F, 1, 1, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 4.1637F, -0.0599F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.7017F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 5, 2, -1.0F, 0.0F, 0.0F, 1, 1, 4, -0.002F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 0.5F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 12, 1, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 4, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.8F, 0.0F);
        this.main.offsetZ = 0.02F;
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float)Math.toRadians(90);
        this.main.rotateAngleY = (float)Math.toRadians(90);
        this.main.offsetY = -0.20F;
        //this.main.offsetX = 0.30F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.9F;
        this.main.offsetX = 0.1F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.2F, 3.75F, 0.3F);
        this.setRotateAngle(tail, 0.0F, 0.7F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.5F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        //this.Vetulicola.offsetY = 1.1F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed *2F, 0.4F, -3, f2, 1F);
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 1);
            //this.flap(main, 0.25F, 0.4F, false, 0, 0, f2, 0.8F);
            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.15F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
