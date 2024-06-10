package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelEulithota extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer tentacleSide2;
    private final AdvancedModelRenderer tentbase4;
    private final AdvancedModelRenderer tentacleB1;
    private final AdvancedModelRenderer tentacleB2;
    private final AdvancedModelRenderer tentacleB3;
    private final AdvancedModelRenderer tentacleB4;
    private final AdvancedModelRenderer tentacleB5;
    private final AdvancedModelRenderer tentacleB6;
    private final AdvancedModelRenderer tentbase5;
    private final AdvancedModelRenderer tentacleB7;
    private final AdvancedModelRenderer tentacleB8;
    private final AdvancedModelRenderer tentacleB9;
    private final AdvancedModelRenderer tentacleB10;
    private final AdvancedModelRenderer tentacleB11;
    private final AdvancedModelRenderer tentacleB12;
    private final AdvancedModelRenderer tentbase6;
    private final AdvancedModelRenderer tentacleB13;
    private final AdvancedModelRenderer tentacleB14;
    private final AdvancedModelRenderer tentacleB15;
    private final AdvancedModelRenderer tentacleB16;
    private final AdvancedModelRenderer tentacleB17;
    private final AdvancedModelRenderer tentacleB18;
    private final AdvancedModelRenderer tentacleSide;
    private final AdvancedModelRenderer tentbase2;
    private final AdvancedModelRenderer tentacleA1;
    private final AdvancedModelRenderer tentacleA2;
    private final AdvancedModelRenderer tentacleA3;
    private final AdvancedModelRenderer tentacleA4;
    private final AdvancedModelRenderer tentacleA5;
    private final AdvancedModelRenderer tentacleA6;
    private final AdvancedModelRenderer tentbase3;
    private final AdvancedModelRenderer tentacleA7;
    private final AdvancedModelRenderer tentacleA8;
    private final AdvancedModelRenderer tentacleA9;
    private final AdvancedModelRenderer tentacleA10;
    private final AdvancedModelRenderer tentacleA11;
    private final AdvancedModelRenderer tentacleA12;
    private final AdvancedModelRenderer tentbase7;
    private final AdvancedModelRenderer tentacleA13;
    private final AdvancedModelRenderer tentacleA14;
    private final AdvancedModelRenderer tentacleA15;
    private final AdvancedModelRenderer tentacleA16;
    private final AdvancedModelRenderer tentacleA17;
    private final AdvancedModelRenderer tentacleA18;
    private final AdvancedModelRenderer midtent;
    private final AdvancedModelRenderer smallmid4;
    private final AdvancedModelRenderer smallmid3;
    private final AdvancedModelRenderer smallmid2;
    private final AdvancedModelRenderer smallmid;

    public ModelEulithota() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.5F, -5.0F, -3.5F, 7, 1, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 9, -2.5F, -6.0F, -2.5F, 5, 1, 5, 0.0F, false));

        this.tentacleSide2 = new AdvancedModelRenderer(this);
        this.tentacleSide2.setRotationPoint(0.5F, -4.0F, 0.0F);
        this.main.addChild(tentacleSide2);


        this.tentbase4 = new AdvancedModelRenderer(this);
        this.tentbase4.setRotationPoint(2.5F, 0.0F, 1.75F);
        this.tentacleSide2.addChild(tentbase4);
        this.setRotateAngle(tentbase4, 0.0F, 1.0472F, 0.0F);


        this.tentacleB1 = new AdvancedModelRenderer(this);
        this.tentacleB1.setRotationPoint(-0.75F, -0.25F, -0.25F);
        this.tentbase4.addChild(tentacleB1);
        this.setRotateAngle(tentacleB1, 0.3491F, 0.0F, 0.0873F);
        this.tentacleB1.cubeList.add(new ModelBox(tentacleB1, 0, 4, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB2 = new AdvancedModelRenderer(this);
        this.tentacleB2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleB1.addChild(tentacleB2);
        this.setRotateAngle(tentacleB2, -0.0873F, 0.0F, 0.0F);
        this.tentacleB2.cubeList.add(new ModelBox(tentacleB2, 3, 3, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB3 = new AdvancedModelRenderer(this);
        this.tentacleB3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleB2.addChild(tentacleB3);
        this.setRotateAngle(tentacleB3, -0.0873F, 0.0F, 0.0F);
        this.tentacleB3.cubeList.add(new ModelBox(tentacleB3, 3, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB4 = new AdvancedModelRenderer(this);
        this.tentacleB4.setRotationPoint(-0.25F, -0.25F, 0.0F);
        this.tentbase4.addChild(tentacleB4);
        this.setRotateAngle(tentacleB4, 0.3491F, 0.0F, -0.0873F);
        this.tentacleB4.cubeList.add(new ModelBox(tentacleB4, 16, 9, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB5 = new AdvancedModelRenderer(this);
        this.tentacleB5.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleB4.addChild(tentacleB5);
        this.setRotateAngle(tentacleB5, -0.0873F, 0.0F, 0.0F);
        this.tentacleB5.cubeList.add(new ModelBox(tentacleB5, 9, 16, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB6 = new AdvancedModelRenderer(this);
        this.tentacleB6.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleB5.addChild(tentacleB6);
        this.setRotateAngle(tentacleB6, -0.0873F, 0.0F, 0.0F);
        this.tentacleB6.cubeList.add(new ModelBox(tentacleB6, 0, 9, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentbase5 = new AdvancedModelRenderer(this);
        this.tentbase5.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.tentacleSide2.addChild(tentbase5);


        this.tentacleB7 = new AdvancedModelRenderer(this);
        this.tentacleB7.setRotationPoint(-0.75F, -0.25F, -0.25F);
        this.tentbase5.addChild(tentacleB7);
        this.setRotateAngle(tentacleB7, 0.3491F, 0.0F, 0.0873F);
        this.tentacleB7.cubeList.add(new ModelBox(tentacleB7, 0, 4, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB8 = new AdvancedModelRenderer(this);
        this.tentacleB8.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleB7.addChild(tentacleB8);
        this.setRotateAngle(tentacleB8, -0.0873F, 0.0F, 0.0F);
        this.tentacleB8.cubeList.add(new ModelBox(tentacleB8, 3, 3, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB9 = new AdvancedModelRenderer(this);
        this.tentacleB9.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleB8.addChild(tentacleB9);
        this.setRotateAngle(tentacleB9, -0.0873F, 0.0F, 0.0F);
        this.tentacleB9.cubeList.add(new ModelBox(tentacleB9, 3, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB10 = new AdvancedModelRenderer(this);
        this.tentacleB10.setRotationPoint(-0.25F, -0.25F, 0.0F);
        this.tentbase5.addChild(tentacleB10);
        this.setRotateAngle(tentacleB10, 0.3491F, 0.0F, -0.0873F);
        this.tentacleB10.cubeList.add(new ModelBox(tentacleB10, 16, 9, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB11 = new AdvancedModelRenderer(this);
        this.tentacleB11.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleB10.addChild(tentacleB11);
        this.setRotateAngle(tentacleB11, -0.0873F, 0.0F, 0.0F);
        this.tentacleB11.cubeList.add(new ModelBox(tentacleB11, 9, 16, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB12 = new AdvancedModelRenderer(this);
        this.tentacleB12.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleB11.addChild(tentacleB12);
        this.setRotateAngle(tentacleB12, -0.0873F, 0.0F, 0.0F);
        this.tentacleB12.cubeList.add(new ModelBox(tentacleB12, 0, 9, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentbase6 = new AdvancedModelRenderer(this);
        this.tentbase6.setRotationPoint(-3.0F, 0.0F, 2.25F);
        this.tentacleSide2.addChild(tentbase6);
        this.setRotateAngle(tentbase6, 0.0F, -1.0472F, 0.0F);


        this.tentacleB13 = new AdvancedModelRenderer(this);
        this.tentacleB13.setRotationPoint(-0.75F, -0.25F, -0.25F);
        this.tentbase6.addChild(tentacleB13);
        this.setRotateAngle(tentacleB13, 0.3491F, 0.0F, 0.0873F);
        this.tentacleB13.cubeList.add(new ModelBox(tentacleB13, 0, 4, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB14 = new AdvancedModelRenderer(this);
        this.tentacleB14.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleB13.addChild(tentacleB14);
        this.setRotateAngle(tentacleB14, -0.0873F, 0.0F, 0.0F);
        this.tentacleB14.cubeList.add(new ModelBox(tentacleB14, 3, 3, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB15 = new AdvancedModelRenderer(this);
        this.tentacleB15.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleB14.addChild(tentacleB15);
        this.setRotateAngle(tentacleB15, -0.0873F, 0.0F, 0.0F);
        this.tentacleB15.cubeList.add(new ModelBox(tentacleB15, 3, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB16 = new AdvancedModelRenderer(this);
        this.tentacleB16.setRotationPoint(-0.25F, -0.25F, 0.0F);
        this.tentbase6.addChild(tentacleB16);
        this.setRotateAngle(tentacleB16, 0.3491F, 0.0F, -0.0873F);
        this.tentacleB16.cubeList.add(new ModelBox(tentacleB16, 16, 9, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB17 = new AdvancedModelRenderer(this);
        this.tentacleB17.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleB16.addChild(tentacleB17);
        this.setRotateAngle(tentacleB17, -0.0873F, 0.0F, 0.0F);
        this.tentacleB17.cubeList.add(new ModelBox(tentacleB17, 9, 16, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleB18 = new AdvancedModelRenderer(this);
        this.tentacleB18.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleB17.addChild(tentacleB18);
        this.setRotateAngle(tentacleB18, -0.0873F, 0.0F, 0.0F);
        this.tentacleB18.cubeList.add(new ModelBox(tentacleB18, 0, 9, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleSide = new AdvancedModelRenderer(this);
        this.tentacleSide.setRotationPoint(0.5F, -4.0F, 0.0F);
        this.main.addChild(tentacleSide);


        this.tentbase2 = new AdvancedModelRenderer(this);
        this.tentbase2.setRotationPoint(2.5F, 0.0F, -1.75F);
        this.tentacleSide.addChild(tentbase2);
        this.setRotateAngle(tentbase2, 0.0F, -1.0472F, 0.0F);


        this.tentacleA1 = new AdvancedModelRenderer(this);
        this.tentacleA1.setRotationPoint(-0.75F, -0.25F, 0.25F);
        this.tentbase2.addChild(tentacleA1);
        this.setRotateAngle(tentacleA1, -0.3491F, 0.0F, 0.0873F);
        this.tentacleA1.cubeList.add(new ModelBox(tentacleA1, 0, 4, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA2 = new AdvancedModelRenderer(this);
        this.tentacleA2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA1.addChild(tentacleA2);
        this.setRotateAngle(tentacleA2, 0.0873F, 0.0F, 0.0F);
        this.tentacleA2.cubeList.add(new ModelBox(tentacleA2, 3, 3, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA3 = new AdvancedModelRenderer(this);
        this.tentacleA3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA2.addChild(tentacleA3);
        this.setRotateAngle(tentacleA3, 0.0873F, 0.0F, 0.0F);
        this.tentacleA3.cubeList.add(new ModelBox(tentacleA3, 3, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA4 = new AdvancedModelRenderer(this);
        this.tentacleA4.setRotationPoint(-0.25F, -0.25F, 0.0F);
        this.tentbase2.addChild(tentacleA4);
        this.setRotateAngle(tentacleA4, -0.3491F, 0.0F, -0.0873F);
        this.tentacleA4.cubeList.add(new ModelBox(tentacleA4, 16, 9, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA5 = new AdvancedModelRenderer(this);
        this.tentacleA5.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA4.addChild(tentacleA5);
        this.setRotateAngle(tentacleA5, 0.0873F, 0.0F, 0.0F);
        this.tentacleA5.cubeList.add(new ModelBox(tentacleA5, 9, 16, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA6 = new AdvancedModelRenderer(this);
        this.tentacleA6.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA5.addChild(tentacleA6);
        this.setRotateAngle(tentacleA6, 0.0873F, 0.0F, 0.0F);
        this.tentacleA6.cubeList.add(new ModelBox(tentacleA6, 0, 9, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentbase3 = new AdvancedModelRenderer(this);
        this.tentbase3.setRotationPoint(0.0F, 0.0F, -3.25F);
        this.tentacleSide.addChild(tentbase3);


        this.tentacleA7 = new AdvancedModelRenderer(this);
        this.tentacleA7.setRotationPoint(-0.75F, -0.25F, 0.25F);
        this.tentbase3.addChild(tentacleA7);
        this.setRotateAngle(tentacleA7, -0.3491F, 0.0F, 0.0873F);
        this.tentacleA7.cubeList.add(new ModelBox(tentacleA7, 0, 4, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA8 = new AdvancedModelRenderer(this);
        this.tentacleA8.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA7.addChild(tentacleA8);
        this.setRotateAngle(tentacleA8, 0.0873F, 0.0F, 0.0F);
        this.tentacleA8.cubeList.add(new ModelBox(tentacleA8, 3, 3, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA9 = new AdvancedModelRenderer(this);
        this.tentacleA9.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA8.addChild(tentacleA9);
        this.setRotateAngle(tentacleA9, 0.0873F, 0.0F, 0.0F);
        this.tentacleA9.cubeList.add(new ModelBox(tentacleA9, 3, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA10 = new AdvancedModelRenderer(this);
        this.tentacleA10.setRotationPoint(-0.25F, -0.25F, 0.0F);
        this.tentbase3.addChild(tentacleA10);
        this.setRotateAngle(tentacleA10, -0.3491F, 0.0F, -0.0873F);
        this.tentacleA10.cubeList.add(new ModelBox(tentacleA10, 16, 9, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA11 = new AdvancedModelRenderer(this);
        this.tentacleA11.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA10.addChild(tentacleA11);
        this.setRotateAngle(tentacleA11, 0.0873F, 0.0F, 0.0F);
        this.tentacleA11.cubeList.add(new ModelBox(tentacleA11, 9, 16, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA12 = new AdvancedModelRenderer(this);
        this.tentacleA12.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA11.addChild(tentacleA12);
        this.setRotateAngle(tentacleA12, 0.0873F, 0.0F, 0.0F);
        this.tentacleA12.cubeList.add(new ModelBox(tentacleA12, 0, 9, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentbase7 = new AdvancedModelRenderer(this);
        this.tentbase7.setRotationPoint(-3.0F, 0.0F, -2.25F);
        this.tentacleSide.addChild(tentbase7);
        this.setRotateAngle(tentbase7, 0.0F, 1.0472F, 0.0F);


        this.tentacleA13 = new AdvancedModelRenderer(this);
        this.tentacleA13.setRotationPoint(-0.75F, -0.25F, 0.25F);
        this.tentbase7.addChild(tentacleA13);
        this.setRotateAngle(tentacleA13, -0.3491F, 0.0F, 0.0873F);
        this.tentacleA13.cubeList.add(new ModelBox(tentacleA13, 0, 4, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA14 = new AdvancedModelRenderer(this);
        this.tentacleA14.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA13.addChild(tentacleA14);
        this.setRotateAngle(tentacleA14, 0.0873F, 0.0F, 0.0F);
        this.tentacleA14.cubeList.add(new ModelBox(tentacleA14, 3, 3, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA15 = new AdvancedModelRenderer(this);
        this.tentacleA15.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA14.addChild(tentacleA15);
        this.setRotateAngle(tentacleA15, 0.0873F, 0.0F, 0.0F);
        this.tentacleA15.cubeList.add(new ModelBox(tentacleA15, 3, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA16 = new AdvancedModelRenderer(this);
        this.tentacleA16.setRotationPoint(-0.25F, -0.25F, 0.0F);
        this.tentbase7.addChild(tentacleA16);
        this.setRotateAngle(tentacleA16, -0.3491F, 0.0F, -0.0873F);
        this.tentacleA16.cubeList.add(new ModelBox(tentacleA16, 16, 9, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA17 = new AdvancedModelRenderer(this);
        this.tentacleA17.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA16.addChild(tentacleA17);
        this.setRotateAngle(tentacleA17, 0.0873F, 0.0F, 0.0F);
        this.tentacleA17.cubeList.add(new ModelBox(tentacleA17, 9, 16, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacleA18 = new AdvancedModelRenderer(this);
        this.tentacleA18.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacleA17.addChild(tentacleA18);
        this.setRotateAngle(tentacleA18, 0.0873F, 0.0F, 0.0F);
        this.tentacleA18.cubeList.add(new ModelBox(tentacleA18, 0, 9, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.midtent = new AdvancedModelRenderer(this);
        this.midtent.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.main.addChild(midtent);
        this.midtent.cubeList.add(new ModelBox(midtent, 0, 16, -1.5F, -5.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.smallmid4 = new AdvancedModelRenderer(this);
        this.smallmid4.setRotationPoint(-1.5F, -3.0F, 0.0F);
        this.midtent.addChild(smallmid4);
        this.setRotateAngle(smallmid4, 0.0F, 0.0F, 0.3491F);
        this.smallmid4.cubeList.add(new ModelBox(smallmid4, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.smallmid3 = new AdvancedModelRenderer(this);
        this.smallmid3.setRotationPoint(0.5F, -3.0F, 0.0F);
        this.midtent.addChild(smallmid3);
        this.setRotateAngle(smallmid3, 0.0F, 0.0F, -0.3491F);
        this.smallmid3.cubeList.add(new ModelBox(smallmid3, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.smallmid2 = new AdvancedModelRenderer(this);
        this.smallmid2.setRotationPoint(-0.5F, -3.0F, 1.0F);
        this.midtent.addChild(smallmid2);
        this.setRotateAngle(smallmid2, 1.5708F, -1.2217F, -1.5708F);
        this.smallmid2.cubeList.add(new ModelBox(smallmid2, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.smallmid = new AdvancedModelRenderer(this);
        this.smallmid.setRotationPoint(-0.5F, -3.0F, -1.0F);
        this.midtent.addChild(smallmid);
        this.setRotateAngle(smallmid, -1.5708F, 1.2217F, -1.5708F);
        this.smallmid.cubeList.add(new ModelBox(smallmid, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.96F);

        this.main.render(f5);
        GlStateManager.disableBlend();

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
        AdvancedModelRenderer[] tentacle1 = {this.tentacleB1, this.tentacleB2, this.tentacleB3};
        AdvancedModelRenderer[] tentacle2 = {this.tentacleB4, this.tentacleB5, this.tentacleB6};
        AdvancedModelRenderer[] tentacle3 = {this.tentacleB7, this.tentacleB8, this.tentacleB9};
        AdvancedModelRenderer[] tentacle4 = {this.tentacleB10, this.tentacleB11, this.tentacleB12};
        AdvancedModelRenderer[] tentacle5 = {this.tentacleB13, this.tentacleB14, this.tentacleB15};
        AdvancedModelRenderer[] tentacle6 = {this.tentacleB16, this.tentacleB17, this.tentacleB18};

        AdvancedModelRenderer[] tentacle7 = {this.tentacleA1, this.tentacleA2, this.tentacleA3};
        AdvancedModelRenderer[] tentacle8 = {this.tentacleA4, this.tentacleA5, this.tentacleA6};
        AdvancedModelRenderer[] tentacle9 = {this.tentacleA7, this.tentacleA8, this.tentacleA9};
        AdvancedModelRenderer[] tentacle10 = {this.tentacleA10, this.tentacleA11, this.tentacleA12};
        AdvancedModelRenderer[] tentacle11 = {this.tentacleA13, this.tentacleA14, this.tentacleA15};
        AdvancedModelRenderer[] tentacle12 = {this.tentacleA16, this.tentacleA17, this.tentacleA18};
        float speed = 0.1F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(main, speed * 0.4F, 0.15F, true, 0, 0, f2, 1);
            this.walk(main, speed * 0.3F, 0.4F, true, 0, 0, f2, 1);
            this.flap(main, speed * 0.2F, 0.3F, true, 0, 0, f2, 1);
            this.chainFlap(tentacle1, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle2, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle3, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle4, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle5, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle6, speed, -0.4F, -3, f2, 1);

            this.chainFlap(tentacle7, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle8, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle9, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle10, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle11, speed, -0.4F, -3, f2, 1);
            this.chainFlap(tentacle12, speed, -0.4F, -3, f2, 1);

            this.walk(this.smallmid, speed * 0.3F, 0.4F, true, 0, 0, f2, 1);
            this.walk(this.smallmid2, speed * 0.3F, 0.4F, true, 0, 0, f2, 1);
            this.walk(this.smallmid3, speed * 0.3F, 0.4F, true, 0, 0, f2, 1);
            this.walk(this.smallmid4, speed * 0.3F, 0.4F, true, 0, 0, f2, 1);

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
