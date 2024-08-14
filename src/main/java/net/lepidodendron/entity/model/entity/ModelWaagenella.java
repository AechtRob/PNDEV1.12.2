package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraWaagenella;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWaagenella extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer whole;
    private final AdvancedModelRenderer lefteyestalk;
    private final AdvancedModelRenderer righteyestalk;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;

    public ModelWaagenella() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.whole = new AdvancedModelRenderer(this);
        this.whole.setRotationPoint(0.5F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-0.5F, -0.75F, -1.5F);
        this.whole.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 19, -2.0F, -3.0F, -0.5F, 4, 3, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.01F, -2.0204F, 3.2096F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.2654F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 23, -0.99F, 0.0F, 0.0F, 2, 2, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.01F, -1.6481F, 1.8673F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.0472F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 15, -1.49F, -1.0F, -1.0F, 3, 2, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.8604F, -2.1144F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.2217F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 11, -2.0F, 0.0F, -2.0F, 4, 2, 2, -0.02F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.0F, -0.5F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.9599F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 21, -2.0F, 0.0F, 0.0F, 4, 2, 2, -0.01F, false));

        this.lefteyestalk = new AdvancedModelRenderer(this);
        this.lefteyestalk.setRotationPoint(0.0F, -1.25F, -4.75F);
        this.whole.addChild(lefteyestalk);
        this.setRotateAngle(lefteyestalk, -0.2182F, 0.0F, 0.0F);
        this.lefteyestalk.cubeList.add(new ModelBox(lefteyestalk, 20, 21, 0.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.righteyestalk = new AdvancedModelRenderer(this);
        this.righteyestalk.setRotationPoint(-1.0F, -1.25F, -4.75F);
        this.whole.addChild(righteyestalk);
        this.setRotateAngle(righteyestalk, -0.2182F, 0.0F, 0.0F);
        this.righteyestalk.cubeList.add(new ModelBox(righteyestalk, 22, 19, -3.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-1.5F, -1.0F, -2.5F);
        this.whole.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 8, -1.5F, -0.675F, -2.0F, 5, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, 0.0F, -2.0F, 10, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 17, 8, -3.5F, 0.0F, -4.0F, 9, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(1.5F, 1.0F, 5.5F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 16, -5.0F, -0.99F, -0.5F, 9, 1, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 19, -3.5F, -1.0F, 3.5F, 6, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        whole.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.whole.offsetY = -1.5F;
        this.whole.offsetX = -0.15F;
        this.whole.rotateAngleY = (float)Math.toRadians(220);
        this.whole.rotateAngleX = (float)Math.toRadians(9);
        this.whole.rotateAngleZ = (float)Math.toRadians(0);
        float scaler = 3.5F;
        this.whole.scaleChildren = true;
        this.whole.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.whole.render(f);
        //Reset rotations, positions and sizing:
        this.whole.setScale(1.0F, 1.0F, 1.0F);
        this.whole.scaleChildren = false;
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
       // this.snail.offsetY = 0.83F;

        EntityPrehistoricFloraWaagenella ee = (EntityPrehistoricFloraWaagenella) e;

        this.body.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.body.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.body.setScaleX(scaler2 * 0.85F);

        this.swing(lefteyestalk, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.swing(righteyestalk, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);
        this.flap(lefteyestalk, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.flap(righteyestalk, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);

        this.lefteyestalk.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.lefteyestalk.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
        this.righteyestalk.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.righteyestalk.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;

    }
}
