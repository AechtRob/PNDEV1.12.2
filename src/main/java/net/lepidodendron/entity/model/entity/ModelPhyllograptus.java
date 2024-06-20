package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPhyllograptus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPhyllograptus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leaf;
    private final AdvancedModelRenderer leaf2;

    public ModelPhyllograptus() {
        this.textureWidth = 24;
        this.textureHeight = 24;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.5F, 23.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 13, 0, -1.0F, -10.0F, -0.75F, 1, 6, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 13, 8, -1.5F, -1.0F, -0.25F, 2, 1, 0, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 4, 8, 1.5F, -1.0F, -0.25F, 1, 1, 0, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 4, 8, -3.5F, -1.0F, -0.25F, 1, 1, 0, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 13, 9, -1.0F, 0.0F, -0.25F, 1, 1, 0, 0.0F, false));

        this.leaf = new AdvancedModelRenderer(this);
        this.leaf.setRotationPoint(0.0F, -7.5F, -0.25F);
        this.main.addChild(leaf);
        this.leaf.cubeList.add(new ModelBox(leaf, 0, 0, -0.5F, -6.5F, 0.0F, 5, 13, 0, 0.0F, false));

        this.leaf2 = new AdvancedModelRenderer(this);
        this.leaf2.setRotationPoint(-1.0F, -7.5F, -0.25F);
        this.main.addChild(leaf2);
        this.leaf2.cubeList.add(new ModelBox(leaf2, 0, 0, -4.5F, -6.5F, 0.0F, 5, 13, 0, 0.0F, true));

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
        EntityPrehistoricFloraPhyllograptus ee = (EntityPrehistoricFloraPhyllograptus) e;

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
            this.main.rotateAngleX = (float) Math.toRadians(270);
            //this.main.offsetY = 1.47F;
            //this.main.scaleChildren = true;
            //this.main.setScaleX(0.2F);
            //this.main.setScaleZ(1.2F);
        }
    }
}
