package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHeliobranchia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer innertent;
    private final AdvancedModelRenderer tent;
    private final AdvancedModelRenderer tentb;
    private final AdvancedModelRenderer tent2;
    private final AdvancedModelRenderer tentb2;
    private final AdvancedModelRenderer tent3;
    private final AdvancedModelRenderer tentb3;
    private final AdvancedModelRenderer innertent2;
    private final AdvancedModelRenderer tent4;
    private final AdvancedModelRenderer tentb4;
    private final AdvancedModelRenderer tent5;
    private final AdvancedModelRenderer tentb5;
    private final AdvancedModelRenderer tent6;
    private final AdvancedModelRenderer tentb6;
    private final AdvancedModelRenderer innertent3;
    private final AdvancedModelRenderer tent7;
    private final AdvancedModelRenderer tentb7;
    private final AdvancedModelRenderer tent8;
    private final AdvancedModelRenderer tentb8;
    private final AdvancedModelRenderer tent9;
    private final AdvancedModelRenderer tentb9;
    private final AdvancedModelRenderer innertent4;
    private final AdvancedModelRenderer tent10;
    private final AdvancedModelRenderer tentb10;
    private final AdvancedModelRenderer tent11;
    private final AdvancedModelRenderer tentb11;
    private final AdvancedModelRenderer tent12;
    private final AdvancedModelRenderer tentb12;
    private final AdvancedModelRenderer tentagroup;
    private final AdvancedModelRenderer tentacle;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentagroup2;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacle6;
    private final AdvancedModelRenderer tentagroup3;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentagroup4;
    private final AdvancedModelRenderer tentacle10;
    private final AdvancedModelRenderer tentacle11;
    private final AdvancedModelRenderer tentacle12;

    public ModelHeliobranchia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 19, -2.5F, -6.1F, -2.5F, 5, 3, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 9, -3.0F, -6.75F, -3.0F, 6, 3, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.5F, -3.75F, -3.5F, 7, 1, 7, 0.0F, false));

        this.innertent = new AdvancedModelRenderer(this);
        this.innertent.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.main.addChild(innertent);


        this.tent = new AdvancedModelRenderer(this);
        this.tent.setRotationPoint(3.3F, -4.0F, -2.0F);
        this.innertent.addChild(tent);
        this.tent.cubeList.add(new ModelBox(tent, 0, 9, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.tentb = new AdvancedModelRenderer(this);
        this.tentb.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tent.addChild(tentb);
        this.tentb.cubeList.add(new ModelBox(tentb, 3, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.tent2 = new AdvancedModelRenderer(this);
        this.tent2.setRotationPoint(3.3F, -4.0F, 0.0F);
        this.innertent.addChild(tent2);
        this.tent2.cubeList.add(new ModelBox(tent2, 0, 9, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.tentb2 = new AdvancedModelRenderer(this);
        this.tentb2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tent2.addChild(tentb2);
        this.tentb2.cubeList.add(new ModelBox(tentb2, 3, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.tent3 = new AdvancedModelRenderer(this);
        this.tent3.setRotationPoint(3.3F, -4.0F, 2.0F);
        this.innertent.addChild(tent3);
        this.tent3.cubeList.add(new ModelBox(tent3, 0, 9, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.tentb3 = new AdvancedModelRenderer(this);
        this.tentb3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tent3.addChild(tentb3);
        this.tentb3.cubeList.add(new ModelBox(tentb3, 3, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.innertent2 = new AdvancedModelRenderer(this);
        this.innertent2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.main.addChild(innertent2);


        this.tent4 = new AdvancedModelRenderer(this);
        this.tent4.setRotationPoint(-3.3F, -4.0F, -2.0F);
        this.innertent2.addChild(tent4);
        this.tent4.cubeList.add(new ModelBox(tent4, 0, 9, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tentb4 = new AdvancedModelRenderer(this);
        this.tentb4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tent4.addChild(tentb4);
        this.tentb4.cubeList.add(new ModelBox(tentb4, 3, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tent5 = new AdvancedModelRenderer(this);
        this.tent5.setRotationPoint(-3.3F, -4.0F, 0.0F);
        this.innertent2.addChild(tent5);
        this.tent5.cubeList.add(new ModelBox(tent5, 0, 9, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tentb5 = new AdvancedModelRenderer(this);
        this.tentb5.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tent5.addChild(tentb5);
        this.tentb5.cubeList.add(new ModelBox(tentb5, 3, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tent6 = new AdvancedModelRenderer(this);
        this.tent6.setRotationPoint(-3.3F, -4.0F, 2.0F);
        this.innertent2.addChild(tent6);
        this.tent6.cubeList.add(new ModelBox(tent6, 0, 9, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tentb6 = new AdvancedModelRenderer(this);
        this.tentb6.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tent6.addChild(tentb6);
        this.tentb6.cubeList.add(new ModelBox(tentb6, 3, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.innertent3 = new AdvancedModelRenderer(this);
        this.innertent3.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.main.addChild(innertent3);
        this.setRotateAngle(innertent3, 0.0F, -1.5708F, 0.0F);


        this.tent7 = new AdvancedModelRenderer(this);
        this.tent7.setRotationPoint(-3.3F, -4.0F, -2.0F);
        this.innertent3.addChild(tent7);
        this.tent7.cubeList.add(new ModelBox(tent7, 0, 9, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tentb7 = new AdvancedModelRenderer(this);
        this.tentb7.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tent7.addChild(tentb7);
        this.tentb7.cubeList.add(new ModelBox(tentb7, 3, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tent8 = new AdvancedModelRenderer(this);
        this.tent8.setRotationPoint(-3.3F, -4.0F, 0.0F);
        this.innertent3.addChild(tent8);
        this.tent8.cubeList.add(new ModelBox(tent8, 0, 9, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tentb8 = new AdvancedModelRenderer(this);
        this.tentb8.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tent8.addChild(tentb8);
        this.tentb8.cubeList.add(new ModelBox(tentb8, 3, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tent9 = new AdvancedModelRenderer(this);
        this.tent9.setRotationPoint(-3.3F, -4.0F, 2.0F);
        this.innertent3.addChild(tent9);
        this.tent9.cubeList.add(new ModelBox(tent9, 0, 9, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tentb9 = new AdvancedModelRenderer(this);
        this.tentb9.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tent9.addChild(tentb9);
        this.tentb9.cubeList.add(new ModelBox(tentb9, 3, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.innertent4 = new AdvancedModelRenderer(this);
        this.innertent4.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.main.addChild(innertent4);
        this.setRotateAngle(innertent4, 0.0F, 1.5708F, 0.0F);


        this.tent10 = new AdvancedModelRenderer(this);
        this.tent10.setRotationPoint(-3.3F, -4.0F, 2.0F);
        this.innertent4.addChild(tent10);
        this.tent10.cubeList.add(new ModelBox(tent10, 0, 9, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tentb10 = new AdvancedModelRenderer(this);
        this.tentb10.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tent10.addChild(tentb10);
        this.tentb10.cubeList.add(new ModelBox(tentb10, 3, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tent11 = new AdvancedModelRenderer(this);
        this.tent11.setRotationPoint(-3.3F, -4.0F, 0.0F);
        this.innertent4.addChild(tent11);
        this.tent11.cubeList.add(new ModelBox(tent11, 0, 9, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tentb11 = new AdvancedModelRenderer(this);
        this.tentb11.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tent11.addChild(tentb11);
        this.tentb11.cubeList.add(new ModelBox(tentb11, 3, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tent12 = new AdvancedModelRenderer(this);
        this.tent12.setRotationPoint(-3.3F, -4.0F, -2.0F);
        this.innertent4.addChild(tent12);
        this.tent12.cubeList.add(new ModelBox(tent12, 0, 9, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tentb12 = new AdvancedModelRenderer(this);
        this.tentb12.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tent12.addChild(tentb12);
        this.tentb12.cubeList.add(new ModelBox(tentb12, 3, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tentagroup = new AdvancedModelRenderer(this);
        this.tentagroup.setRotationPoint(3.55F, -3.0F, -2.0F);
        this.main.addChild(tentagroup);


        this.tentacle = new AdvancedModelRenderer(this);
        this.tentacle.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tentagroup.addChild(tentacle);
        this.setRotateAngle(tentacle, 0.202F, 0.0829F, -1.1261F);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 0, 19, 0.1475F, -0.2647F, -0.3406F, 0, 2, 1, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(0.5F, 0.15F, 1.75F);
        this.tentagroup.addChild(tentacle2);
        this.setRotateAngle(tentacle2, 0.0154F, 0.0414F, -1.0487F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 0, 0.1475F, -1.2647F, -0.3406F, 0, 3, 1, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentagroup.addChild(tentacle3);
        this.setRotateAngle(tentacle3, -0.202F, -0.0829F, -1.1261F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 3, 9, 0.1475F, -0.2647F, -0.6594F, 0, 2, 1, 0.0F, false));

        this.tentagroup2 = new AdvancedModelRenderer(this);
        this.tentagroup2.setRotationPoint(-3.55F, -3.0F, -2.0F);
        this.main.addChild(tentagroup2);


        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tentagroup2.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.202F, -0.0829F, 1.1261F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 0, 19, -0.1475F, -0.2647F, -0.3406F, 0, 2, 1, 0.0F, true));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(-0.5F, 0.15F, 1.75F);
        this.tentagroup2.addChild(tentacle5);
        this.setRotateAngle(tentacle5, 0.0154F, -0.0414F, 1.0487F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 0, 0, -0.1475F, -1.2647F, -0.3406F, 0, 3, 1, 0.0F, true));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentagroup2.addChild(tentacle6);
        this.setRotateAngle(tentacle6, -0.202F, 0.0829F, 1.1261F);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 3, 9, -0.1475F, -0.2647F, -0.6594F, 0, 2, 1, 0.0F, true));

        this.tentagroup3 = new AdvancedModelRenderer(this);
        this.tentagroup3.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.main.addChild(tentagroup3);
        this.setRotateAngle(tentagroup3, 0.0F, 1.5708F, 0.0F);


        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(-3.55F, -4.0F, 2.0F);
        this.tentagroup3.addChild(tentacle7);
        this.setRotateAngle(tentacle7, 0.202F, -0.0829F, 1.1261F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 0, 19, -0.1475F, -0.2647F, -0.3406F, 0, 2, 1, 0.0F, true));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(-4.05F, -3.85F, -0.25F);
        this.tentagroup3.addChild(tentacle8);
        this.setRotateAngle(tentacle8, 0.0154F, -0.0414F, 1.0487F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 0, 0, -0.1475F, -1.2647F, -0.3406F, 0, 3, 1, 0.0F, true));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(-3.55F, -4.0F, -2.0F);
        this.tentagroup3.addChild(tentacle9);
        this.setRotateAngle(tentacle9, -0.202F, 0.0829F, 1.1261F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 3, 9, -0.1475F, -0.2647F, -0.6594F, 0, 2, 1, 0.0F, true));

        this.tentagroup4 = new AdvancedModelRenderer(this);
        this.tentagroup4.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.main.addChild(tentagroup4);
        this.setRotateAngle(tentagroup4, 0.0F, -1.5708F, 0.0F);


        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(-3.55F, -4.0F, -2.0F);
        this.tentagroup4.addChild(tentacle10);
        this.setRotateAngle(tentacle10, -0.202F, 0.0829F, 1.1261F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 0, 19, -0.1475F, -0.2647F, -0.6594F, 0, 2, 1, 0.0F, true));

        this.tentacle11 = new AdvancedModelRenderer(this);
        this.tentacle11.setRotationPoint(-4.05F, -3.85F, 0.25F);
        this.tentagroup4.addChild(tentacle11);
        this.setRotateAngle(tentacle11, -0.0154F, 0.0414F, 1.0487F);
        this.tentacle11.cubeList.add(new ModelBox(tentacle11, 0, 0, -0.1475F, -1.2647F, -0.6594F, 0, 3, 1, 0.0F, true));

        this.tentacle12 = new AdvancedModelRenderer(this);
        this.tentacle12.setRotationPoint(-3.55F, -4.0F, 2.0F);
        this.tentagroup4.addChild(tentacle12);
        this.setRotateAngle(tentacle12, 0.202F, -0.0829F, 1.1261F);
        this.tentacle12.cubeList.add(new ModelBox(tentacle12, 3, 9, -0.1475F, -0.2647F, -0.3406F, 0, 2, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);

    }

    @Override
    public void renderStaticBook(float f) {

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

        //this.main.offsetY = 0.8F;
        this.main.setScaleX(1.0F);
        this.main.setScaleZ(1.0F);
        this.main.scaleChildren = false;
        AdvancedModelRenderer[] tentacle1 = {this.tent, this.tentb};
        AdvancedModelRenderer[] tentacle2 = {this.tent2, this.tentb2};
        AdvancedModelRenderer[] tentacle3 = {this.tent3, this.tentb3};
        AdvancedModelRenderer[] tentacle4 = {this.tent4, this.tentb4};
        AdvancedModelRenderer[] tentacle5 = {this.tent5, this.tentb5};
        AdvancedModelRenderer[] tentacle6 = {this.tent6, this.tentb6};
        AdvancedModelRenderer[] tentacle7 = {this.tent7, this.tentb7};
        AdvancedModelRenderer[] tentacle8 = {this.tent8, this.tentb8};
        AdvancedModelRenderer[] tentacle9 = {this.tent9, this.tentb9};
        AdvancedModelRenderer[] tentacle10 = {this.tent10, this.tentb10};
        AdvancedModelRenderer[] tentacle11= {this.tent11, this.tentb11};
        AdvancedModelRenderer[] tentacle12 = {this.tent12, this.tentb12};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            //this.swing(main, speed * 0.4F, 0.5F, true, 0, 0, f2, 1);
            this.walk(main, speed * 0.3F, 0.15F, true, 0, 0, f2, 1);
            this.flap(main, speed * 0.1F, 0.6F, true, 0, 0, f2, 1);
            this.chainFlap(tentacle1, speed, 0.4F, -3, f2, 1);
            this.chainFlap(tentacle2, speed, 0.4F, -3, f2, 1);
            this.chainFlap(tentacle3, speed, 0.4F, -3, f2, 1);
            this.chainFlap(tentacle4, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle5, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle6, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle7, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle8, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle9, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle10, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle11, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle12, speed, -0.4F, -3, f2, 1);
            this.bob(main, -speed * 0.5F, 1F, false, f2, 1);

            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                //this.main.offsetY = 1.2F;
                this.main.scaleChildren = true;
                this.main.setScaleX(0.2F);
                this.main.setScaleZ(1.2F);
            }
        }
    }
}
