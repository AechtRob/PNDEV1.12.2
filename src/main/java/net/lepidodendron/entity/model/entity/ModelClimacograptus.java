package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraClimacograptus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelClimacograptus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;

    public ModelClimacograptus() {
        this.textureWidth = 8;
        this.textureHeight = 8;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.0019F, 17.6154F, -0.9615F);
        this.main.cubeList.add(new ModelBox(main, 3, 0, 0.0019F, 3.3846F, -0.0385F, 0, 2, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 3, 0, 0.0019F, 1.1346F, -0.0385F, 0, 2, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 3, 0, 0.0019F, -1.1154F, -0.0385F, 0, 2, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 3, 0, 0.0019F, -3.3654F, -0.0385F, 0, 2, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 3, 0, 0.0019F, -5.6154F, -0.0385F, 0, 2, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 3, 0, 0.0019F, 3.3846F, -0.0385F, 0, 2, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, 0.0019F, -6.1154F, -1.0385F, 0, 2, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, 0.0019F, -3.8654F, -1.0385F, 0, 2, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, 0.0019F, -1.6154F, -1.0385F, 0, 2, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, 0.0019F, 0.6346F, -1.0385F, 0, 2, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, 0.0019F, 2.8846F, -1.0385F, 0, 2, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0019F, -5.6154F, -0.0385F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 0, -0.025F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0019F, 4.8846F, -0.0385F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 3, -0.05F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.0F;
        this.main.offsetX = 0.2F;
        this.main.rotateAngleY = (float)Math.toRadians(150);
        this.main.rotateAngleX = (float)Math.toRadians(3);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

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

       //this.main.offsetY = 1.2F;
        EntityPrehistoricFloraClimacograptus ee = (EntityPrehistoricFloraClimacograptus) e;

        float speed = 0.13F;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled() && e.isInWater()) {
            this.swing(main, speed * 0.4F, 0.25F, true, 0, 0, f2, 0.6F);
            this.walk(main, speed * 0.3F, 0.4F, true, 0, 0, f2, 0.6F);
            this.flap(main, speed * 0.2F, 0.4F, true, 0, 0, f2, 0.6F);
            this.bob(main, -speed * 0.5F, 0.5F, false, f2, 0.6F);
//            this.main.scaleChildren = true;
//            float bouncer = (float) (Math.abs(Math.abs(Math.abs((double)ee.getRotationDegree() - 180D) - 90D) - 45D) / 90D);
//            this.main.setScale(1 , (1 + bouncer), 1);
            this.main.rotateAngleY = (float) Math.toRadians(ee.getRotationDegree());
        }

        if (!e.isInWater()) {
            this.resetToDefaultPose();
            this.main.rotateAngleX = (float) Math.toRadians(90);
            this.main.rotateAngleZ = (float) Math.toRadians(90);
            this.main.offsetY = 0.39F;
//            this.main.scaleChildren = true;
//            this.main.setScaleX(0.2F);
//            this.main.setScaleZ(1.2F);
        }
    }
}
