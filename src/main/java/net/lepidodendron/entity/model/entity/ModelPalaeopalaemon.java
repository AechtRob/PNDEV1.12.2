package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraIcarosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeopalaemon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelPalaeopalaemon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer rightantenna;
    private final AdvancedModelRenderer leftantenna;
    private final AdvancedModelRenderer abdomen1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightpleopod;
    private final AdvancedModelRenderer leftpleopod;
    private final AdvancedModelRenderer rightpleopod2;
    private final AdvancedModelRenderer leftpleopod2;
    private final AdvancedModelRenderer abdomen2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer abdomen3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer abdomen4;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer rightpleopod5;
    private final AdvancedModelRenderer leftpleopod5;
    private final AdvancedModelRenderer rightpleopod4;
    private final AdvancedModelRenderer leftpleopod4;
    private final AdvancedModelRenderer rightpleopod3;
    private final AdvancedModelRenderer leftpleopod3;
    private final AdvancedModelRenderer rightclaw;
    private final AdvancedModelRenderer rightclaw2;
    private final AdvancedModelRenderer rightclaw3;
    private final AdvancedModelRenderer rightclawfinger;
    private final AdvancedModelRenderer leftclaw;
    private final AdvancedModelRenderer leftclaw2;
    private final AdvancedModelRenderer leftclaw3;
    private final AdvancedModelRenderer leftclawfinger;
    private final AdvancedModelRenderer rightclawraptorial;
    private final AdvancedModelRenderer rightclawraptorial2;
    private final AdvancedModelRenderer rightclawraptorial3;
    private final AdvancedModelRenderer leftclawraptorial;
    private final AdvancedModelRenderer leftclawraptorial2;
    private final AdvancedModelRenderer leftclawraptorial3;

    private ModelAnimator animator;


    public ModelPalaeopalaemon() {
        this.textureWidth = 38;
        this.textureHeight = 39;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 20.75F, -2.0F);
        this.setRotateAngle(Body, -0.1309F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 9, -1.5F, -1.0F, -4.0F, 3, 1, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, -1.0F, -4.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.5672F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 19, 0.0F, 0.001F, 1.0F, 3, 0, 7, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -1.0F, -4.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.5672F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 19, -3.0F, 0.001F, 1.0F, 3, 0, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.001F, -4.0F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.096F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 8, -0.5F, 0.001F, -4.0F, 1, 0, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.1F, 0.25F, 4.0F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0688F, -0.0121F, -0.1741F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, -5, 19, -0.2F, 0.5F, -7.0F, 3, 0, 7, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.1F, 0.25F, 4.0F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0688F, 0.0121F, 0.1741F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -5, 19, -2.8F, 0.5F, -7.0F, 3, 0, 7, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-1.1079F, 0.2611F, 1.7914F);
        this.Body.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.7285F, 0.1666F, -0.2155F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 26, 7, -5.0F, 0.0F, 0.0F, 5, 2, 0, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(1.1079F, 0.2611F, 1.7914F);
        this.Body.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.7285F, -0.1666F, 0.2155F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 26, 7, 0.0F, 0.0F, 0.0F, 5, 2, 0, 0.0F, true));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(-0.9652F, 0.2412F, 2.8056F);
        this.Body.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.9319F, 0.5552F, -0.1626F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 19, 27, -7.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, false));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.9652F, 0.2412F, 2.8056F);
        this.Body.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.9319F, -0.5552F, 0.1626F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 19, 27, 0.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.9186F, 0.3997F, 1.1477F);
        this.Body.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.7511F, -0.2935F, -0.2609F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 26, 1, -5.0F, 0.0F, 0.0F, 5, 2, 0, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.9186F, 0.3997F, 1.1477F);
        this.Body.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.7511F, 0.2935F, 0.2609F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 26, 1, 0.0F, 0.0F, 0.0F, 5, 2, 0, 0.0F, true));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-0.7144F, 0.2938F, 0.2902F);
        this.Body.addChild(rightleg);
        this.setRotateAngle(rightleg, 1.2264F, -0.7768F, -0.5774F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 26, 4, -5.0F, 0.0F, 0.0F, 5, 2, 0, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(0.7144F, 0.2938F, 0.2902F);
        this.Body.addChild(leftleg);
        this.setRotateAngle(leftleg, 1.2264F, 0.7768F, 0.5774F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 26, 4, 0.0F, 0.0F, 0.0F, 5, 2, 0, 0.0F, true));

        this.rightantenna = new AdvancedModelRenderer(this);
        this.rightantenna.setRotationPoint(-1.2F, -0.35F, -3.0F);
        this.Body.addChild(rightantenna);
        this.setRotateAngle(rightantenna, -0.4363F, 1.1781F, 0.2618F);
        this.rightantenna.cubeList.add(new ModelBox(rightantenna, -6, 0, -3.0F, 0.0F, -8.0F, 6, 0, 8, 0.0F, false));

        this.leftantenna = new AdvancedModelRenderer(this);
        this.leftantenna.setRotationPoint(1.2F, -0.35F, -3.0F);
        this.Body.addChild(leftantenna);
        this.setRotateAngle(leftantenna, -0.4363F, -1.1781F, -0.2618F);
        this.leftantenna.cubeList.add(new ModelBox(leftantenna, -6, 0, -3.0F, 0.0F, -8.0F, 6, 0, 8, 0.0F, true));

        this.abdomen1 = new AdvancedModelRenderer(this);
        this.abdomen1.setRotationPoint(-0.025F, -0.725F, 4.025F);
        this.Body.addChild(abdomen1);
        this.setRotateAngle(abdomen1, 0.0436F, 0.0F, 0.0F);
        this.abdomen1.cubeList.add(new ModelBox(abdomen1, 15, 3, -0.975F, -0.275F, -0.025F, 2, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.025F, -0.276F, -0.025F);
        this.abdomen1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.5672F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 16, 0.0F, 0.001F, 0.0F, 2, 0, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.975F, -0.276F, -0.025F);
        this.abdomen1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.5672F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 16, -2.0F, 0.001F, 0.0F, 2, 0, 2, 0.0F, false));

        this.rightpleopod = new AdvancedModelRenderer(this);
        this.rightpleopod.setRotationPoint(-0.725F, 0.725F, 0.475F);
        this.abdomen1.addChild(rightpleopod);
        this.setRotateAngle(rightpleopod, 0.3707F, 0.22F, 0.5061F);
        this.rightpleopod.cubeList.add(new ModelBox(rightpleopod, 14, 36, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.leftpleopod = new AdvancedModelRenderer(this);
        this.leftpleopod.setRotationPoint(0.775F, 0.725F, 0.475F);
        this.abdomen1.addChild(leftpleopod);
        this.setRotateAngle(leftpleopod, 0.3707F, -0.22F, -0.5061F);
        this.leftpleopod.cubeList.add(new ModelBox(leftpleopod, 14, 36, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.rightpleopod2 = new AdvancedModelRenderer(this);
        this.rightpleopod2.setRotationPoint(-0.725F, 0.725F, 1.875F);
        this.abdomen1.addChild(rightpleopod2);
        this.setRotateAngle(rightpleopod2, 0.3707F, 0.22F, 0.5061F);
        this.rightpleopod2.cubeList.add(new ModelBox(rightpleopod2, 17, 36, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.leftpleopod2 = new AdvancedModelRenderer(this);
        this.leftpleopod2.setRotationPoint(0.775F, 0.725F, 1.875F);
        this.abdomen1.addChild(leftpleopod2);
        this.setRotateAngle(leftpleopod2, 0.3707F, -0.22F, -0.5061F);
        this.leftpleopod2.cubeList.add(new ModelBox(leftpleopod2, 17, 36, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.abdomen2 = new AdvancedModelRenderer(this);
        this.abdomen2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.abdomen1.addChild(abdomen2);
        this.setRotateAngle(abdomen2, 0.0873F, 0.0F, 0.0F);
        this.abdomen2.cubeList.add(new ModelBox(abdomen2, 24, 10, -0.975F, -0.275F, -0.025F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.025F, -0.276F, -0.025F);
        this.abdomen2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.5672F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 20, 0.0F, 0.001F, 0.0F, 2, 0, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.975F, -0.276F, -0.025F);
        this.abdomen2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.5672F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 20, -2.0F, 0.001F, 0.0F, 2, 0, 2, 0.0F, false));

        this.abdomen3 = new AdvancedModelRenderer(this);
        this.abdomen3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.abdomen2.addChild(abdomen3);
        this.setRotateAngle(abdomen3, 0.0873F, 0.0F, 0.0F);
        this.abdomen3.cubeList.add(new ModelBox(abdomen3, 0, 33, -0.975F, -0.275F, -0.025F, 2, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.025F, -0.276F, -0.025F);
        this.abdomen3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.5672F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 31, 24, 0.0F, 0.001F, 0.0F, 2, 0, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.975F, -0.276F, -0.025F);
        this.abdomen3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.5672F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 31, 24, -2.0F, 0.001F, 0.0F, 2, 0, 2, 0.0F, false));

        this.abdomen4 = new AdvancedModelRenderer(this);
        this.abdomen4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.abdomen3.addChild(abdomen4);
        this.setRotateAngle(abdomen4, -0.1745F, 0.0F, 0.0F);
        this.abdomen4.cubeList.add(new ModelBox(abdomen4, 24, 14, -0.975F, -0.275F, -0.025F, 2, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.6403F, 0.2102F, 1.8307F);
        this.abdomen4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.076F, -0.8984F, -0.7307F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 35, -0.8628F, 0.4034F, -0.1104F, 1, 0, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.3665F, -0.2557F, 2.0051F);
        this.abdomen4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3116F, -0.4864F, -0.3716F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 27, -1.7859F, 0.1208F, -0.0483F, 2, 0, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.6903F, 0.2102F, 1.8307F);
        this.abdomen4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.076F, 0.8984F, 0.7307F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 35, -0.1372F, 0.4034F, -0.1104F, 1, 0, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.4165F, -0.2557F, 2.0051F);
        this.abdomen4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3116F, 0.4864F, 0.3716F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 27, -0.2141F, 0.1208F, -0.0483F, 2, 0, 4, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.025F, -0.276F, -0.025F);
        this.abdomen4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.5672F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, -1, 11, 0.0F, 0.001F, 0.0F, 2, 0, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.975F, -0.276F, -0.025F);
        this.abdomen4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.5672F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, -1, 11, -2.0F, 0.001F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.025F, -0.276F, 1.975F);
        this.abdomen4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3491F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 22, 22, -1.0F, 0.001F, 0.0F, 2, 0, 4, 0.0F, false));

        this.rightpleopod5 = new AdvancedModelRenderer(this);
        this.rightpleopod5.setRotationPoint(-0.725F, 0.725F, 0.075F);
        this.abdomen4.addChild(rightpleopod5);
        this.setRotateAngle(rightpleopod5, 0.3707F, 0.22F, 0.5061F);
        this.rightpleopod5.cubeList.add(new ModelBox(rightpleopod5, 26, 36, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.leftpleopod5 = new AdvancedModelRenderer(this);
        this.leftpleopod5.setRotationPoint(0.775F, 0.725F, 0.075F);
        this.abdomen4.addChild(leftpleopod5);
        this.setRotateAngle(leftpleopod5, 0.3707F, -0.22F, -0.5061F);
        this.leftpleopod5.cubeList.add(new ModelBox(leftpleopod5, 26, 36, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.rightpleopod4 = new AdvancedModelRenderer(this);
        this.rightpleopod4.setRotationPoint(-0.725F, 0.725F, 0.675F);
        this.abdomen3.addChild(rightpleopod4);
        this.setRotateAngle(rightpleopod4, 0.3707F, 0.22F, 0.5061F);
        this.rightpleopod4.cubeList.add(new ModelBox(rightpleopod4, 23, 36, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.leftpleopod4 = new AdvancedModelRenderer(this);
        this.leftpleopod4.setRotationPoint(0.775F, 0.725F, 0.675F);
        this.abdomen3.addChild(leftpleopod4);
        this.setRotateAngle(leftpleopod4, 0.3707F, -0.22F, -0.5061F);
        this.leftpleopod4.cubeList.add(new ModelBox(leftpleopod4, 23, 36, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.rightpleopod3 = new AdvancedModelRenderer(this);
        this.rightpleopod3.setRotationPoint(-0.725F, 0.725F, 1.275F);
        this.abdomen2.addChild(rightpleopod3);
        this.setRotateAngle(rightpleopod3, 0.3707F, 0.22F, 0.5061F);
        this.rightpleopod3.cubeList.add(new ModelBox(rightpleopod3, 20, 36, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.leftpleopod3 = new AdvancedModelRenderer(this);
        this.leftpleopod3.setRotationPoint(0.775F, 0.725F, 1.275F);
        this.abdomen2.addChild(leftpleopod3);
        this.setRotateAngle(leftpleopod3, 0.3707F, -0.22F, -0.5061F);
        this.leftpleopod3.cubeList.add(new ModelBox(leftpleopod3, 20, 36, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.rightclaw = new AdvancedModelRenderer(this);
        this.rightclaw.setRotationPoint(-0.78F, -0.0211F, -0.2563F);
        this.Body.addChild(rightclaw);
        this.setRotateAngle(rightclaw, 0.1975F, 0.5131F, -0.127F);
        this.rightclaw.cubeList.add(new ModelBox(rightclaw, 10, 24, 0.001F, -0.5F, -3.0F, 0, 1, 3, 0.0F, false));

        this.rightclaw2 = new AdvancedModelRenderer(this);
        this.rightclaw2.setRotationPoint(0.001F, 0.0F, -3.0F);
        this.rightclaw.addChild(rightclaw2);
        this.setRotateAngle(rightclaw2, 0.0385F, -0.2148F, -0.1787F);
        this.rightclaw2.cubeList.add(new ModelBox(rightclaw2, 10, 30, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.rightclaw3 = new AdvancedModelRenderer(this);
        this.rightclaw3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.rightclaw2.addChild(rightclaw3);
        this.setRotateAngle(rightclaw3, 0.143F, -0.1868F, -0.2848F);
        this.rightclaw3.cubeList.add(new ModelBox(rightclaw3, 20, 30, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));
        this.rightclaw3.cubeList.add(new ModelBox(rightclaw3, 33, 9, 0.0F, 0.25F, -3.0F, 0, 1, 2, 0.0F, false));

        this.rightclawfinger = new AdvancedModelRenderer(this);
        this.rightclawfinger.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.rightclaw3.addChild(rightclawfinger);
        this.setRotateAngle(rightclawfinger, 0.5236F, 0.0F, 0.0F);
        this.rightclawfinger.cubeList.add(new ModelBox(rightclawfinger, 33, 13, -0.5F, 0.0F, -1.5F, 1, 0, 2, 0.0F, false));

        this.leftclaw = new AdvancedModelRenderer(this);
        this.leftclaw.setRotationPoint(0.78F, -0.0211F, -0.2563F);
        this.Body.addChild(leftclaw);
        this.setRotateAngle(leftclaw, 0.1975F, -0.5131F, 0.127F);
        this.leftclaw.cubeList.add(new ModelBox(leftclaw, 10, 24, -0.001F, -0.5F, -3.0F, 0, 1, 3, 0.0F, true));

        this.leftclaw2 = new AdvancedModelRenderer(this);
        this.leftclaw2.setRotationPoint(-0.001F, 0.0F, -3.0F);
        this.leftclaw.addChild(leftclaw2);
        this.setRotateAngle(leftclaw2, 0.0385F, 0.2148F, 0.1787F);
        this.leftclaw2.cubeList.add(new ModelBox(leftclaw2, 10, 30, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.leftclaw3 = new AdvancedModelRenderer(this);
        this.leftclaw3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.leftclaw2.addChild(leftclaw3);
        this.setRotateAngle(leftclaw3, 0.143F, 0.1868F, 0.2848F);
        this.leftclaw3.cubeList.add(new ModelBox(leftclaw3, 20, 30, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));
        this.leftclaw3.cubeList.add(new ModelBox(leftclaw3, 33, 9, 0.0F, 0.25F, -3.0F, 0, 1, 2, 0.0F, true));

        this.leftclawfinger = new AdvancedModelRenderer(this);
        this.leftclawfinger.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.leftclaw3.addChild(leftclawfinger);
        this.setRotateAngle(leftclawfinger, 0.5236F, 0.0F, 0.0F);
        this.leftclawfinger.cubeList.add(new ModelBox(leftclawfinger, 33, 13, -0.5F, 0.0F, -1.5F, 1, 0, 2, 0.0F, true));

        this.rightclawraptorial = new AdvancedModelRenderer(this);
        this.rightclawraptorial.setRotationPoint(-0.6646F, 0.4451F, -1.063F);
        this.Body.addChild(rightclawraptorial);
        this.setRotateAngle(rightclawraptorial, -0.2419F, 0.0179F, -0.1094F);
        this.rightclawraptorial.cubeList.add(new ModelBox(rightclawraptorial, 16, -3, -0.025F, 0.0F, -4.0F, 0, 1, 4, 0.0F, false));

        this.rightclawraptorial2 = new AdvancedModelRenderer(this);
        this.rightclawraptorial2.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.rightclawraptorial.addChild(rightclawraptorial2);
        this.setRotateAngle(rightclawraptorial2, 2.1817F, 0.0F, 0.0F);
        this.rightclawraptorial2.cubeList.add(new ModelBox(rightclawraptorial2, 28, 28, -0.01F, -0.5F, -3.0F, 0, 1, 3, 0.0F, false));

        this.rightclawraptorial3 = new AdvancedModelRenderer(this);
        this.rightclawraptorial3.setRotationPoint(0.0F, -0.2588F, -2.9659F);
        this.rightclawraptorial2.addChild(rightclawraptorial3);
        this.setRotateAngle(rightclawraptorial3, 1.3963F, 0.0F, 0.0F);
        this.rightclawraptorial3.cubeList.add(new ModelBox(rightclawraptorial3, 22, 14, 0.0F, -0.5F, -5.0F, 0, 2, 5, 0.0F, false));

        this.leftclawraptorial = new AdvancedModelRenderer(this);
        this.leftclawraptorial.setRotationPoint(0.6646F, 0.4451F, -1.063F);
        this.Body.addChild(leftclawraptorial);
        this.setRotateAngle(leftclawraptorial, -0.2419F, -0.0179F, 0.1094F);
        this.leftclawraptorial.cubeList.add(new ModelBox(leftclawraptorial, 16, -3, 0.025F, 0.0F, -4.0F, 0, 1, 4, 0.0F, true));

        this.leftclawraptorial2 = new AdvancedModelRenderer(this);
        this.leftclawraptorial2.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.leftclawraptorial.addChild(leftclawraptorial2);
        this.setRotateAngle(leftclawraptorial2, 2.1817F, 0.0F, 0.0F);
        this.leftclawraptorial2.cubeList.add(new ModelBox(leftclawraptorial2, 28, 28, 0.01F, -0.5F, -3.0F, 0, 1, 3, 0.0F, true));

        this.leftclawraptorial3 = new AdvancedModelRenderer(this);
        this.leftclawraptorial3.setRotationPoint(0.0F, -0.2588F, -2.9659F);
        this.leftclawraptorial2.addChild(leftclawraptorial3);
        this.setRotateAngle(leftclawraptorial3, 1.3963F, 0.0F, 0.0F);
        this.leftclawraptorial3.cubeList.add(new ModelBox(leftclawraptorial3, 22, 14, 0.0F, -0.5F, -5.0F, 0, 2, 5, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.Body.offsetZ = 0.030F;
        this.Body.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = -1.6F;
        this.Body.offsetX = -1.0F;
        this.Body.offsetZ = 2.0F;
        this.Body.rotateAngleY = (float)Math.toRadians(200);
        this.Body.rotateAngleX = (float)Math.toRadians(8);
        this.Body.rotateAngleZ = (float)Math.toRadians(-8);
        this.Body.scaleChildren = true;
        float scaler = 4.0F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Body, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.Body.render(f);
        //Reset rotations, positions and sizing:
        this.Body.setScale(1.0F, 1.0F, 1.0F);
        this.Body.scaleChildren = false;
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
        //this.resetToDefaultPose();
       // this.body.offsetY = 0.4F;
        //this.carapace.offsetY = -0.2F;
        //this.carapace.offsetZ = 0.1F;


        AdvancedModelRenderer[] fishBody = {this.abdomen1, this.abdomen2, this.abdomen3, this.abdomen4};
        AdvancedModelRenderer[] fishTail = {this.abdomen3, this.abdomen4};



        //mouthparts:
        //this.walk(cheliceraL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        //this.walk(cheliceraR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraPalaeopalaemon slimon = (EntityPrehistoricFloraPalaeopalaemon) e;

        this.Body.offsetZ = 0.1F;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {//on land
            if(!slimon.getIsMoving()) {
                this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
                this.chainSwing(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
                this.chainWave(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
            }

            //this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            //this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            //this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            //this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);

                //this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.01F, -2, f2, 1);
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPalaeopalaemon ee = (EntityPrehistoricFloraPalaeopalaemon) entitylivingbaseIn;
        //Swimming pose:

        if (ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                //Walk pose:
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
            }
            else { //in water but not moving:
                if (ee.getAnimation() != ee.UNSWIM_ANIMATION && ee.getAnimation() != ee.SWIM_ANIMATION) {
                    //Walk static pose:
                    animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
            }
        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
    }


    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPalaeopalaemon entity = (EntityPrehistoricFloraPalaeopalaemon) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-52.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -52.5 + (((tickAnim - 5) / 3) * (-62.55443-(-52.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.91881-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-3.41232-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -62.55443 + (((tickAnim - 8) / 2) * (-52.60886-(-62.55443)));
            yy = -0.91881 + (((tickAnim - 8) / 2) * (-1.83762-(-0.91881)));
            zz = -3.41232 + (((tickAnim - 8) / 2) * (-6.82463-(-3.41232)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -52.60886 + (((tickAnim - 10) / 9) * (-39.6511-(-52.60886)));
            yy = -1.83762 + (((tickAnim - 10) / 9) * (-0.77374-(-1.83762)));
            zz = -6.82463 + (((tickAnim - 10) / 9) * (-2.87353-(-6.82463)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -39.6511 + (((tickAnim - 19) / 9) * (-35.46-(-39.6511)));
            yy = -0.77374 + (((tickAnim - 19) / 9) * (-0.46-(-0.77374)));
            zz = -2.87353 + (((tickAnim - 19) / 9) * (-5.06-(-2.87353)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -35.46 + (((tickAnim - 28) / 12) * (0-(-35.46)));
            yy = -0.46 + (((tickAnim - 28) / 12) * (0-(-0.46)));
            zz = -5.06 + (((tickAnim - 28) / 12) * (0-(-5.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (3.50425-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (4.15482-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 3.50425 + (((tickAnim - 5) / 5) * (3.50425-(3.50425)));
            zz = 4.15482 + (((tickAnim - 5) / 5) * (3.15482-(4.15482)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 10) / 9) * (-0.06616-(0)));
            yy = 3.50425 + (((tickAnim - 10) / 9) * (3.11506-(3.50425)));
            zz = 3.15482 + (((tickAnim - 10) / 9) * (2.31326-(3.15482)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -0.06616 + (((tickAnim - 19) / 9) * (-0.07-(-0.06616)));
            yy = 3.11506 + (((tickAnim - 19) / 9) * (2.83-(3.11506)));
            zz = 2.31326 + (((tickAnim - 19) / 9) * (2.09-(2.31326)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -0.07 + (((tickAnim - 28) / 12) * (0-(-0.07)));
            yy = 2.83 + (((tickAnim - 28) / 12) * (0-(2.83)));
            zz = 2.09 + (((tickAnim - 28) / 12) * (0-(2.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (-48.11448-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (-15.03083-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-59.87999-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -48.11448 + (((tickAnim - 13) / 3) * (-48.11448-(-48.11448)));
            yy = -15.03083 + (((tickAnim - 13) / 3) * (-15.03083-(-15.03083)));
            zz = -59.87999 + (((tickAnim - 13) / 3) * (-59.87999-(-59.87999)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -48.11448 + (((tickAnim - 16) / 2) * (-32.08-(-48.11448)));
            yy = -15.03083 + (((tickAnim - 16) / 2) * (-10.02-(-15.03083)));
            zz = -59.87999 + (((tickAnim - 16) / 2) * (-27.42-(-59.87999)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -32.08 + (((tickAnim - 18) / 5) * (-48.11448-(-32.08)));
            yy = -10.02 + (((tickAnim - 18) / 5) * (-15.03083-(-10.02)));
            zz = -27.42 + (((tickAnim - 18) / 5) * (-59.87999-(-27.42)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -48.11448 + (((tickAnim - 23) / 3) * (-48.11448-(-48.11448)));
            yy = -15.03083 + (((tickAnim - 23) / 3) * (-15.03083-(-15.03083)));
            zz = -59.87999 + (((tickAnim - 23) / 3) * (-59.87999-(-59.87999)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -48.11448 + (((tickAnim - 26) / 2) * (-32.08-(-48.11448)));
            yy = -15.03083 + (((tickAnim - 26) / 2) * (-10.02-(-15.03083)));
            zz = -59.87999 + (((tickAnim - 26) / 2) * (-27.42-(-59.87999)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -32.08 + (((tickAnim - 28) / 5) * (-50.13851-(-32.08)));
            yy = -10.02 + (((tickAnim - 28) / 5) * (-9.30424-(-10.02)));
            zz = -27.42 + (((tickAnim - 28) / 5) * (-17.70348-(-27.42)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -50.13851 + (((tickAnim - 33) / 4) * (-21.77152-(-50.13851)));
            yy = -9.30424 + (((tickAnim - 33) / 4) * (-6.66795-(-9.30424)));
            zz = -17.70348 + (((tickAnim - 33) / 4) * (-0.78969-(-17.70348)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -21.77152 + (((tickAnim - 37) / 3) * (0-(-21.77152)));
            yy = -6.66795 + (((tickAnim - 37) / 3) * (0-(-6.66795)));
            zz = -0.78969 + (((tickAnim - 37) / 3) * (0-(-0.78969)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-48.11448-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (15.03083-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (59.87999-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -48.11448 + (((tickAnim - 12) / 3) * (-48.11448-(-48.11448)));
            yy = 15.03083 + (((tickAnim - 12) / 3) * (15.03083-(15.03083)));
            zz = 59.87999 + (((tickAnim - 12) / 3) * (59.87999-(59.87999)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -48.11448 + (((tickAnim - 15) / 3) * (-32.08-(-48.11448)));
            yy = 15.03083 + (((tickAnim - 15) / 3) * (10.02-(15.03083)));
            zz = 59.87999 + (((tickAnim - 15) / 3) * (27.42-(59.87999)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -32.08 + (((tickAnim - 18) / 4) * (-48.11448-(-32.08)));
            yy = 10.02 + (((tickAnim - 18) / 4) * (15.03083-(10.02)));
            zz = 27.42 + (((tickAnim - 18) / 4) * (59.87999-(27.42)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -48.11448 + (((tickAnim - 22) / 3) * (-48.11448-(-48.11448)));
            yy = 15.03083 + (((tickAnim - 22) / 3) * (15.03083-(15.03083)));
            zz = 59.87999 + (((tickAnim - 22) / 3) * (59.87999-(59.87999)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -48.11448 + (((tickAnim - 25) / 3) * (-32.08-(-48.11448)));
            yy = 15.03083 + (((tickAnim - 25) / 3) * (10.02-(15.03083)));
            zz = 59.87999 + (((tickAnim - 25) / 3) * (27.42-(59.87999)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -32.08 + (((tickAnim - 28) / 4) * (-49.59873-(-32.08)));
            yy = 10.02 + (((tickAnim - 28) / 4) * (12.5271-(10.02)));
            zz = 27.42 + (((tickAnim - 28) / 4) * (39.98087-(27.42)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -49.59873 + (((tickAnim - 32) / 4) * (-24.49794-(-49.59873)));
            yy = 12.5271 + (((tickAnim - 32) / 4) * (9.95021-(12.5271)));
            zz = 39.98087 + (((tickAnim - 32) / 4) * (8.04047-(39.98087)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -24.49794 + (((tickAnim - 36) / 4) * (0-(-24.49794)));
            yy = 9.95021 + (((tickAnim - 36) / 4) * (0-(9.95021)));
            zz = 8.04047 + (((tickAnim - 36) / 4) * (0-(8.04047)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.73155-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-1.00304-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (14.49743-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.73155 + (((tickAnim - 2) / 1) * (-16.00235-(-0.73155)));
            yy = -1.00304 + (((tickAnim - 2) / 1) * (-31.62562-(-1.00304)));
            zz = 14.49743 + (((tickAnim - 2) / 1) * (-7.93703-(14.49743)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -16.00235 + (((tickAnim - 3) / 2) * (-27.05897-(-16.00235)));
            yy = -31.62562 + (((tickAnim - 3) / 2) * (-27.12188-(-31.62562)));
            zz = -7.93703 + (((tickAnim - 3) / 2) * (-39.08947-(-7.93703)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -27.05897 + (((tickAnim - 5) / 3) * (-26.06923-(-27.05897)));
            yy = -27.12188 + (((tickAnim - 5) / 3) * (-24.15475-(-27.12188)));
            zz = -39.08947 + (((tickAnim - 5) / 3) * (-47.78292-(-39.08947)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -26.06923 + (((tickAnim - 8) / 2) * (-23.98499-(-26.06923)));
            yy = -24.15475 + (((tickAnim - 8) / 2) * (-33.23648-(-24.15475)));
            zz = -47.78292 + (((tickAnim - 8) / 2) * (-49.19929-(-47.78292)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -23.98499 + (((tickAnim - 10) / 8) * (-16.44771-(-23.98499)));
            yy = -33.23648 + (((tickAnim - 10) / 8) * (-45.59918-(-33.23648)));
            zz = -49.19929 + (((tickAnim - 10) / 8) * (-44.1316-(-49.19929)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -16.44771 + (((tickAnim - 18) / 10) * (-16.69037-(-16.44771)));
            yy = -45.59918 + (((tickAnim - 18) / 10) * (-52.97912-(-45.59918)));
            zz = -44.1316 + (((tickAnim - 18) / 10) * (-38.804-(-44.1316)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -16.69037 + (((tickAnim - 28) / 4) * (12.32406-(-16.69037)));
            yy = -52.97912 + (((tickAnim - 28) / 4) * (-47.2594-(-52.97912)));
            zz = -38.804 + (((tickAnim - 28) / 4) * (-2.84489-(-38.804)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 12.32406 + (((tickAnim - 32) / 4) * (0.02567-(12.32406)));
            yy = -47.2594 + (((tickAnim - 32) / 4) * (1.15762-(-47.2594)));
            zz = -2.84489 + (((tickAnim - 32) / 4) * (9.21075-(-2.84489)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0.02567 + (((tickAnim - 36) / 4) * (0-(0.02567)));
            yy = 1.15762 + (((tickAnim - 36) / 4) * (0-(1.15762)));
            zz = 9.21075 + (((tickAnim - 36) / 4) * (0-(9.21075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.73155-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.00304-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-14.49743-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.73155 + (((tickAnim - 3) / 2) * (-16.00235-(-0.73155)));
            yy = 1.00304 + (((tickAnim - 3) / 2) * (31.62562-(1.00304)));
            zz = -14.49743 + (((tickAnim - 3) / 2) * (7.93703-(-14.49743)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -16.00235 + (((tickAnim - 5) / 2) * (-27.05897-(-16.00235)));
            yy = 31.62562 + (((tickAnim - 5) / 2) * (27.12188-(31.62562)));
            zz = 7.93703 + (((tickAnim - 5) / 2) * (39.08947-(7.93703)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -27.05897 + (((tickAnim - 7) / 2) * (-24.40874-(-27.05897)));
            yy = 27.12188 + (((tickAnim - 7) / 2) * (25.71273-(27.12188)));
            zz = 39.08947 + (((tickAnim - 7) / 2) * (52.04023-(39.08947)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -24.40874 + (((tickAnim - 9) / 3) * (-23.95363-(-24.40874)));
            yy = 25.71273 + (((tickAnim - 9) / 3) * (31.76229-(25.71273)));
            zz = 52.04023 + (((tickAnim - 9) / 3) * (51.81236-(52.04023)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -23.95363 + (((tickAnim - 12) / 7) * (-17.70727-(-23.95363)));
            yy = 31.76229 + (((tickAnim - 12) / 7) * (43.10418-(31.76229)));
            zz = 51.81236 + (((tickAnim - 12) / 7) * (43.54539-(51.81236)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -17.70727 + (((tickAnim - 19) / 9) * (-15.97207-(-17.70727)));
            yy = 43.10418 + (((tickAnim - 19) / 9) * (47.7608-(43.10418)));
            zz = 43.54539 + (((tickAnim - 19) / 9) * (44.44846-(43.54539)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -15.97207 + (((tickAnim - 28) / 4) * (-19.26743-(-15.97207)));
            yy = 47.7608 + (((tickAnim - 28) / 4) * (58.93071-(47.7608)));
            zz = 44.44846 + (((tickAnim - 28) / 4) * (32.08389-(44.44846)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -19.26743 + (((tickAnim - 32) / 4) * (-5.56543-(-19.26743)));
            yy = 58.93071 + (((tickAnim - 32) / 4) * (40.30445-(58.93071)));
            zz = 32.08389 + (((tickAnim - 32) / 4) * (-1.88672-(32.08389)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -5.56543 + (((tickAnim - 36) / 4) * (0-(-5.56543)));
            yy = 40.30445 + (((tickAnim - 36) / 4) * (0-(40.30445)));
            zz = -1.88672 + (((tickAnim - 36) / 4) * (0-(-1.88672)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-30.2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -30.2 + (((tickAnim - 8) / 4) * (-30.2-(-30.2)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-62.2-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -30.2 + (((tickAnim - 12) / 3) * (-30.2-(-30.2)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = -62.2 + (((tickAnim - 12) / 3) * (-62.2-(-62.2)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -30.2 + (((tickAnim - 15) / 3) * (-30.2-(-30.2)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = -62.2 + (((tickAnim - 15) / 3) * (-34.2-(-62.2)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -30.2 + (((tickAnim - 18) / 4) * (-30.2-(-30.2)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = -34.2 + (((tickAnim - 18) / 4) * (-62.2-(-34.2)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -30.2 + (((tickAnim - 22) / 3) * (-30.2-(-30.2)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = -62.2 + (((tickAnim - 22) / 3) * (-62.2-(-62.2)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -30.2 + (((tickAnim - 25) / 3) * (-30.2-(-30.2)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = -62.2 + (((tickAnim - 25) / 3) * (-34.2-(-62.2)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -30.2 + (((tickAnim - 28) / 4) * (-30.2-(-30.2)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = -34.2 + (((tickAnim - 28) / 4) * (-62.2-(-34.2)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -30.2 + (((tickAnim - 32) / 4) * (-21.09279-(-30.2)));
            yy = 0 + (((tickAnim - 32) / 4) * (-7.43569-(0)));
            zz = -62.2 + (((tickAnim - 32) / 4) * (-14.1587-(-62.2)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -21.09279 + (((tickAnim - 36) / 4) * (0-(-21.09279)));
            yy = -7.43569 + (((tickAnim - 36) / 4) * (0-(-7.43569)));
            zz = -14.1587 + (((tickAnim - 36) / 4) * (0-(-14.1587)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-30.2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -30.2 + (((tickAnim - 8) / 3) * (-30.2-(-30.2)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (62.2-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -30.2 + (((tickAnim - 11) / 3) * (-30.2-(-30.2)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 62.2 + (((tickAnim - 11) / 3) * (62.2-(62.2)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -30.2 + (((tickAnim - 14) / 3) * (-30.2-(-30.2)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 62.2 + (((tickAnim - 14) / 3) * (34.2-(62.2)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -30.2 + (((tickAnim - 17) / 4) * (-30.2-(-30.2)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 34.2 + (((tickAnim - 17) / 4) * (62.2-(34.2)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -30.2 + (((tickAnim - 21) / 3) * (-30.2-(-30.2)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 62.2 + (((tickAnim - 21) / 3) * (62.2-(62.2)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -30.2 + (((tickAnim - 24) / 3) * (-30.2-(-30.2)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 62.2 + (((tickAnim - 24) / 3) * (34.2-(62.2)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -30.2 + (((tickAnim - 27) / 4) * (-30.2-(-30.2)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 34.2 + (((tickAnim - 27) / 4) * (62.2-(34.2)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = -30.2 + (((tickAnim - 31) / 5) * (-17.71943-(-30.2)));
            yy = 0 + (((tickAnim - 31) / 5) * (5.75633-(0)));
            zz = 62.2 + (((tickAnim - 31) / 5) * (16.47865-(62.2)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -17.71943 + (((tickAnim - 36) / 4) * (0-(-17.71943)));
            yy = 5.75633 + (((tickAnim - 36) / 4) * (0-(5.75633)));
            zz = 16.47865 + (((tickAnim - 36) / 4) * (0-(16.47865)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -21 + (((tickAnim - 8) / 3) * (-21-(-21)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-39.9-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -21 + (((tickAnim - 11) / 3) * (-21-(-21)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = -39.9 + (((tickAnim - 11) / 3) * (-39.9-(-39.9)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -21 + (((tickAnim - 14) / 3) * (-45-(-21)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = -39.9 + (((tickAnim - 14) / 3) * (-17.7-(-39.9)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -45 + (((tickAnim - 17) / 4) * (-21-(-45)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = -17.7 + (((tickAnim - 17) / 4) * (-39.9-(-17.7)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -21 + (((tickAnim - 21) / 3) * (-21-(-21)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = -39.9 + (((tickAnim - 21) / 3) * (-39.9-(-39.9)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -21 + (((tickAnim - 24) / 3) * (-45-(-21)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = -39.9 + (((tickAnim - 24) / 3) * (-17.7-(-39.9)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -45 + (((tickAnim - 27) / 4) * (-21-(-45)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = -17.7 + (((tickAnim - 27) / 4) * (-39.9-(-17.7)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -21 + (((tickAnim - 31) / 9) * (0-(-21)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = -39.9 + (((tickAnim - 31) / 9) * (0-(-39.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -21 + (((tickAnim - 7) / 3) * (-21-(-21)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (39.9-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -21 + (((tickAnim - 10) / 3) * (-21-(-21)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 39.9 + (((tickAnim - 10) / 3) * (39.9-(39.9)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -21 + (((tickAnim - 13) / 3) * (-45-(-21)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 39.9 + (((tickAnim - 13) / 3) * (17.7-(39.9)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -45 + (((tickAnim - 16) / 4) * (-21-(-45)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 17.7 + (((tickAnim - 16) / 4) * (39.9-(17.7)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -21 + (((tickAnim - 20) / 3) * (-21-(-21)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 39.9 + (((tickAnim - 20) / 3) * (39.9-(39.9)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -21 + (((tickAnim - 23) / 3) * (-45-(-21)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 39.9 + (((tickAnim - 23) / 3) * (17.7-(39.9)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -45 + (((tickAnim - 26) / 4) * (-21-(-45)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 17.7 + (((tickAnim - 26) / 4) * (39.9-(17.7)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -21 + (((tickAnim - 30) / 10) * (0-(-21)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 39.9 + (((tickAnim - 30) / 10) * (0-(39.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 5) / 13) * (19.5-(30)));
            yy = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 19.5 + (((tickAnim - 18) / 14) * (14.07-(19.5)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 14.07 + (((tickAnim - 32) / 8) * (0-(14.07)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen1, abdomen1.rotateAngleX + (float) Math.toRadians(xx), abdomen1.rotateAngleY + (float) Math.toRadians(yy), abdomen1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 5) / 3) * (29.46-(7.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 29.46 + (((tickAnim - 8) / 2) * (7.19-(29.46)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 7.19 + (((tickAnim - 10) / 30) * (0-(7.19)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen2, abdomen2.rotateAngleX + (float) Math.toRadians(xx), abdomen2.rotateAngleY + (float) Math.toRadians(yy), abdomen2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 5) / 5) * (8.14-(2.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 8.14 + (((tickAnim - 10) / 9) * (-0.35-(8.14)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -0.35 + (((tickAnim - 19) / 9) * (9.79-(-0.35)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 9.79 + (((tickAnim - 28) / 12) * (0-(9.79)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen3, abdomen3.rotateAngleX + (float) Math.toRadians(xx), abdomen3.rotateAngleY + (float) Math.toRadians(yy), abdomen3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (40-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 40 + (((tickAnim - 5) / 13) * (34.71-(40)));
            yy = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 34.71 + (((tickAnim - 18) / 22) * (0-(34.71)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen4, abdomen4.rotateAngleX + (float) Math.toRadians(xx), abdomen4.rotateAngleY + (float) Math.toRadians(yy), abdomen4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (45-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 9) / 31) * (0-(0)));
            yy = 45 + (((tickAnim - 9) / 31) * (0-(45)));
            zz = 0 + (((tickAnim - 9) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightclaw, rightclaw.rotateAngleX + (float) Math.toRadians(xx), rightclaw.rotateAngleY + (float) Math.toRadians(yy), rightclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-45-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 9) / 14) * (0-(0)));
            yy = -45 + (((tickAnim - 9) / 14) * (-41.82-(-45)));
            zz = 0 + (((tickAnim - 9) / 14) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = -41.82 + (((tickAnim - 23) / 17) * (0-(-41.82)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftclaw, leftclaw.rotateAngleX + (float) Math.toRadians(xx), leftclaw.rotateAngleY + (float) Math.toRadians(yy), leftclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 11.25 + (((tickAnim - 3) / 2) * (22.5-(11.25)));
            yy = 5 + (((tickAnim - 3) / 2) * (10-(5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 22.5 + (((tickAnim - 5) / 2) * (90.88403-(22.5)));
            yy = 10 + (((tickAnim - 5) / 2) * (6.07196-(10)));
            zz = 0 + (((tickAnim - 5) / 2) * (6.45114-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 90.88403 + (((tickAnim - 7) / 5) * (9.75127-(90.88403)));
            yy = 6.07196 + (((tickAnim - 7) / 5) * (5.16116-(6.07196)));
            zz = 6.45114 + (((tickAnim - 7) / 5) * (5.48346-(6.45114)));
        }
        else if (tickAnim >= 12 && tickAnim < 40) {
            xx = 9.75127 + (((tickAnim - 12) / 28) * (0-(9.75127)));
            yy = 5.16116 + (((tickAnim - 12) / 28) * (0-(5.16116)));
            zz = 5.48346 + (((tickAnim - 12) / 28) * (0-(5.48346)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightclawraptorial, rightclawraptorial.rotateAngleX + (float) Math.toRadians(xx), rightclawraptorial.rotateAngleY + (float) Math.toRadians(yy), rightclawraptorial.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-90-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -90 + (((tickAnim - 5) / 3) * (-35-(-90)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 40) {
            xx = -35 + (((tickAnim - 8) / 32) * (0-(-35)));
            yy = 0 + (((tickAnim - 8) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightclawraptorial2, rightclawraptorial2.rotateAngleX + (float) Math.toRadians(xx), rightclawraptorial2.rotateAngleY + (float) Math.toRadians(yy), rightclawraptorial2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 33.75 + (((tickAnim - 3) / 2) * (-67.5-(33.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -67.5 + (((tickAnim - 5) / 3) * (0-(-67.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 8) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightclawraptorial3, rightclawraptorial3.rotateAngleX + (float) Math.toRadians(xx), rightclawraptorial3.rotateAngleY + (float) Math.toRadians(yy), rightclawraptorial3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 11.25 + (((tickAnim - 3) / 2) * (22.5-(11.25)));
            yy = -5 + (((tickAnim - 3) / 2) * (-10-(-5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 22.5 + (((tickAnim - 5) / 2) * (90.88403-(22.5)));
            yy = -10 + (((tickAnim - 5) / 2) * (-6.07196-(-10)));
            zz = 0 + (((tickAnim - 5) / 2) * (-6.45114-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 90.88403 + (((tickAnim - 7) / 5) * (9.75127-(90.88403)));
            yy = -6.07196 + (((tickAnim - 7) / 5) * (-5.16116-(-6.07196)));
            zz = -6.45114 + (((tickAnim - 7) / 5) * (-5.48346-(-6.45114)));
        }
        else if (tickAnim >= 12 && tickAnim < 40) {
            xx = 9.75127 + (((tickAnim - 12) / 28) * (0-(9.75127)));
            yy = -5.16116 + (((tickAnim - 12) / 28) * (0-(-5.16116)));
            zz = -5.48346 + (((tickAnim - 12) / 28) * (0-(-5.48346)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftclawraptorial, leftclawraptorial.rotateAngleX + (float) Math.toRadians(xx), leftclawraptorial.rotateAngleY + (float) Math.toRadians(yy), leftclawraptorial.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-90-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -90 + (((tickAnim - 5) / 3) * (0-(-90)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 8) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftclawraptorial2, leftclawraptorial2.rotateAngleX + (float) Math.toRadians(xx), leftclawraptorial2.rotateAngleY + (float) Math.toRadians(yy), leftclawraptorial2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (26.59-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 26.59 + (((tickAnim - 3) / 6) * (-67.5-(26.59)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -67.5 + (((tickAnim - 9) / 4) * (-7.5-(-67.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 13) / 27) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftclawraptorial3, leftclawraptorial3.rotateAngleX + (float) Math.toRadians(xx), leftclawraptorial3.rotateAngleY + (float) Math.toRadians(yy), leftclawraptorial3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (45-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 45 + (((tickAnim - 8) / 14) * (8.55-(45)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 8.55 + (((tickAnim - 22) / 7) * (22.55-(8.55)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            yy = 22.55 + (((tickAnim - 29) / 11) * (0-(22.55)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightantenna, rightantenna.rotateAngleX + (float) Math.toRadians(xx), rightantenna.rotateAngleY + (float) Math.toRadians(yy), rightantenna.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-45-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 8) / 24) * (0-(0)));
            yy = -45 + (((tickAnim - 8) / 24) * (0.66-(-45)));
            zz = 0 + (((tickAnim - 8) / 24) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0.66 + (((tickAnim - 32) / 8) * (0-(0.66)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftantenna, leftantenna.rotateAngleX + (float) Math.toRadians(xx), leftantenna.rotateAngleY + (float) Math.toRadians(yy), leftantenna.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightpleopod, rightpleopod.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*20), rightpleopod.rotateAngleY + (float) Math.toRadians(0), rightpleopod.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod, leftpleopod.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*20), leftpleopod.rotateAngleY + (float) Math.toRadians(0), leftpleopod.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightpleopod2, rightpleopod2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60*2))*20), rightpleopod2.rotateAngleY + (float) Math.toRadians(0), rightpleopod2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod2, leftpleopod2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60*2))*20), leftpleopod2.rotateAngleY + (float) Math.toRadians(0), leftpleopod2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightpleopod5, rightpleopod5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60*5))*20), rightpleopod5.rotateAngleY + (float) Math.toRadians(0), rightpleopod5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod5, leftpleopod5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60*5))*20), leftpleopod5.rotateAngleY + (float) Math.toRadians(0), leftpleopod5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightpleopod4, rightpleopod4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60*4))*20), rightpleopod4.rotateAngleY + (float) Math.toRadians(0), rightpleopod4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod4, leftpleopod4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60*4))*20), leftpleopod4.rotateAngleY + (float) Math.toRadians(0), leftpleopod4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightpleopod3, rightpleopod3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60*3))*20), rightpleopod3.rotateAngleY + (float) Math.toRadians(0), rightpleopod3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod3, leftpleopod3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60*3))*20), leftpleopod3.rotateAngleY + (float) Math.toRadians(0), leftpleopod3.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraPalaeopalaemon entity = (EntityPrehistoricFloraPalaeopalaemon) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*2));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*0.1);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.1);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0);


        this.setRotateAngle(rightantenna, rightantenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+115))*5), rightantenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+60*3))*10), rightantenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-90))*5));


        this.setRotateAngle(leftantenna, leftantenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-115))*5), leftantenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+60))*10), leftantenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-90))*5));


        this.setRotateAngle(abdomen1, abdomen1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*2), abdomen1.rotateAngleY + (float) Math.toRadians(0), abdomen1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightpleopod, rightpleopod.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), rightpleopod.rotateAngleY + (float) Math.toRadians(0), rightpleopod.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightpleopod2, rightpleopod2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60*2))*20), rightpleopod2.rotateAngleY + (float) Math.toRadians(0), rightpleopod2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(abdomen4, abdomen4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*3))*2), abdomen4.rotateAngleY + (float) Math.toRadians(0), abdomen4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightpleopod5, rightpleopod5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60*5))*20), rightpleopod5.rotateAngleY + (float) Math.toRadians(0), rightpleopod5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightpleopod4, rightpleopod4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60*4))*20), rightpleopod4.rotateAngleY + (float) Math.toRadians(0), rightpleopod4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightpleopod3, rightpleopod3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60*3))*20), rightpleopod3.rotateAngleY + (float) Math.toRadians(0), rightpleopod3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightclaw, rightclaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+115))*2), rightclaw.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*4), rightclaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftclaw, leftclaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-115))*2), leftclaw.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-145))*4), leftclaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod, leftpleopod.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), leftpleopod.rotateAngleY + (float) Math.toRadians(0), leftpleopod.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod2, leftpleopod2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60*2))*20), leftpleopod2.rotateAngleY + (float) Math.toRadians(0), leftpleopod2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod5, leftpleopod5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60*5))*20), leftpleopod5.rotateAngleY + (float) Math.toRadians(0), leftpleopod5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod4, leftpleopod4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60*4))*20), leftpleopod4.rotateAngleY + (float) Math.toRadians(0), leftpleopod4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod3, leftpleopod3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60*3))*20), leftpleopod3.rotateAngleY + (float) Math.toRadians(0), leftpleopod3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 9.52 + (((tickAnim - 0) / 3) * (20.35572-(9.52)));
            yy = 5.41 + (((tickAnim - 0) / 3) * (-7.28059-(5.41)));
            zz = 1.73 + (((tickAnim - 0) / 3) * (2.07506-(1.73)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 20.35572 + (((tickAnim - 3) / 4) * (2.80518-(20.35572)));
            yy = -7.28059 + (((tickAnim - 3) / 4) * (-12.07342-(-7.28059)));
            zz = 2.07506 + (((tickAnim - 3) / 4) * (-1.46529-(2.07506)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 2.80518 + (((tickAnim - 7) / 10) * (-4.91877-(2.80518)));
            yy = -12.07342 + (((tickAnim - 7) / 10) * (22.34025-(-12.07342)));
            zz = -1.46529 + (((tickAnim - 7) / 10) * (1.26789-(-1.46529)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -4.91877 + (((tickAnim - 17) / 6) * (20.35572-(-4.91877)));
            yy = 22.34025 + (((tickAnim - 17) / 6) * (-7.28059-(22.34025)));
            zz = 1.26789 + (((tickAnim - 17) / 6) * (2.07506-(1.26789)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 20.35572 + (((tickAnim - 23) / 4) * (2.80518-(20.35572)));
            yy = -7.28059 + (((tickAnim - 23) / 4) * (-12.07342-(-7.28059)));
            zz = 2.07506 + (((tickAnim - 23) / 4) * (-1.46529-(2.07506)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 2.80518 + (((tickAnim - 27) / 10) * (-4.91877-(2.80518)));
            yy = -12.07342 + (((tickAnim - 27) / 10) * (22.34025-(-12.07342)));
            zz = -1.46529 + (((tickAnim - 27) / 10) * (1.26789-(-1.46529)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -4.91877 + (((tickAnim - 37) / 3) * (9.52-(-4.91877)));
            yy = 22.34025 + (((tickAnim - 37) / 3) * (5.41-(22.34025)));
            zz = 1.26789 + (((tickAnim - 37) / 3) * (1.73-(1.26789)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -0.41 + (((tickAnim - 0) / 6) * (-4.91877-(-0.41)));
            yy = -2.27 + (((tickAnim - 0) / 6) * (-22.34025-(-2.27)));
            zz = 0.33 + (((tickAnim - 0) / 6) * (-1.26789-(0.33)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -4.91877 + (((tickAnim - 6) / 6) * (20.35572-(-4.91877)));
            yy = -22.34025 + (((tickAnim - 6) / 6) * (7.28059-(-22.34025)));
            zz = -1.26789 + (((tickAnim - 6) / 6) * (-2.07506-(-1.26789)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 20.35572 + (((tickAnim - 12) / 4) * (2.80518-(20.35572)));
            yy = 7.28059 + (((tickAnim - 12) / 4) * (12.07342-(7.28059)));
            zz = -2.07506 + (((tickAnim - 12) / 4) * (1.46529-(-2.07506)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 2.80518 + (((tickAnim - 16) / 10) * (-4.91877-(2.80518)));
            yy = 12.07342 + (((tickAnim - 16) / 10) * (-22.34025-(12.07342)));
            zz = 1.46529 + (((tickAnim - 16) / 10) * (-1.26789-(1.46529)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -4.91877 + (((tickAnim - 26) / 6) * (20.35572-(-4.91877)));
            yy = -22.34025 + (((tickAnim - 26) / 6) * (7.28059-(-22.34025)));
            zz = -1.26789 + (((tickAnim - 26) / 6) * (-2.07506-(-1.26789)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 20.35572 + (((tickAnim - 32) / 4) * (2.80518-(20.35572)));
            yy = 7.28059 + (((tickAnim - 32) / 4) * (12.07342-(7.28059)));
            zz = -2.07506 + (((tickAnim - 32) / 4) * (1.46529-(-2.07506)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 2.80518 + (((tickAnim - 36) / 4) * (-0.41-(2.80518)));
            yy = 12.07342 + (((tickAnim - 36) / 4) * (-2.27-(12.07342)));
            zz = 1.46529 + (((tickAnim - 36) / 4) * (0.33-(1.46529)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.39 + (((tickAnim - 0) / 5) * (-2.14852-(0.39)));
            yy = -1.19 + (((tickAnim - 0) / 5) * (13.25296-(-1.19)));
            zz = -0.25 + (((tickAnim - 0) / 5) * (0.39066-(-0.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -2.14852 + (((tickAnim - 5) / 6) * (-4.89928-(-2.14852)));
            yy = 13.25296 + (((tickAnim - 5) / 6) * (-6.71319-(13.25296)));
            zz = 0.39066 + (((tickAnim - 5) / 6) * (11.91712-(0.39066)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -4.89928 + (((tickAnim - 11) / 4) * (2.9364-(-4.89928)));
            yy = -6.71319 + (((tickAnim - 11) / 4) * (-15.63603-(-6.71319)));
            zz = 11.91712 + (((tickAnim - 11) / 4) * (-0.89637-(11.91712)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 2.9364 + (((tickAnim - 15) / 10) * (-2.14852-(2.9364)));
            yy = -15.63603 + (((tickAnim - 15) / 10) * (13.25296-(-15.63603)));
            zz = -0.89637 + (((tickAnim - 15) / 10) * (0.39066-(-0.89637)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -2.14852 + (((tickAnim - 25) / 6) * (-4.89928-(-2.14852)));
            yy = 13.25296 + (((tickAnim - 25) / 6) * (-6.71319-(13.25296)));
            zz = 0.39066 + (((tickAnim - 25) / 6) * (11.91712-(0.39066)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -4.89928 + (((tickAnim - 31) / 4) * (2.9364-(-4.89928)));
            yy = -6.71319 + (((tickAnim - 31) / 4) * (-15.63603-(-6.71319)));
            zz = 11.91712 + (((tickAnim - 31) / 4) * (-0.89637-(11.91712)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 2.9364 + (((tickAnim - 35) / 5) * (0.39-(2.9364)));
            yy = -15.63603 + (((tickAnim - 35) / 5) * (-1.19-(-15.63603)));
            zz = -0.89637 + (((tickAnim - 35) / 5) * (-0.25-(-0.89637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 0) / 5) * (-1.5-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -1.5 + (((tickAnim - 5) / 10) * (0.5-(-1.5)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0.5 + (((tickAnim - 15) / 10) * (-1.5-(0.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -1.5 + (((tickAnim - 25) / 10) * (0.5-(-1.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.5 + (((tickAnim - 35) / 5) * (-0.5-(0.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -4.89928 + (((tickAnim - 0) / 4) * (2.9364-(-4.89928)));
            yy = 6.71319 + (((tickAnim - 0) / 4) * (15.63603-(6.71319)));
            zz = -11.91712 + (((tickAnim - 0) / 4) * (0.89637-(-11.91712)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 2.9364 + (((tickAnim - 4) / 10) * (-2.14852-(2.9364)));
            yy = 15.63603 + (((tickAnim - 4) / 10) * (-13.25296-(15.63603)));
            zz = 0.89637 + (((tickAnim - 4) / 10) * (-0.39066-(0.89637)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -2.14852 + (((tickAnim - 14) / 6) * (-4.89928-(-2.14852)));
            yy = -13.25296 + (((tickAnim - 14) / 6) * (6.71319-(-13.25296)));
            zz = -0.39066 + (((tickAnim - 14) / 6) * (-11.91712-(-0.39066)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -4.89928 + (((tickAnim - 20) / 4) * (2.9364-(-4.89928)));
            yy = 6.71319 + (((tickAnim - 20) / 4) * (15.63603-(6.71319)));
            zz = -11.91712 + (((tickAnim - 20) / 4) * (0.89637-(-11.91712)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = 2.9364 + (((tickAnim - 24) / 10) * (-2.14852-(2.9364)));
            yy = 15.63603 + (((tickAnim - 24) / 10) * (-13.25296-(15.63603)));
            zz = 0.89637 + (((tickAnim - 24) / 10) * (-0.39066-(0.89637)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -2.14852 + (((tickAnim - 34) / 6) * (-4.89928-(-2.14852)));
            yy = -13.25296 + (((tickAnim - 34) / 6) * (6.71319-(-13.25296)));
            zz = -0.39066 + (((tickAnim - 34) / 6) * (-11.91712-(-0.39066)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.33 + (((tickAnim - 0) / 4) * (-0.5-(0.33)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = -0.5 + (((tickAnim - 4) / 10) * (1.5-(-0.5)));
            yy = 0 + (((tickAnim - 4) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 10) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 1.5 + (((tickAnim - 14) / 10) * (-0.5-(1.5)));
            yy = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 10) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = -0.5 + (((tickAnim - 24) / 10) * (1.5-(-0.5)));
            yy = 0 + (((tickAnim - 24) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 10) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 1.5 + (((tickAnim - 34) / 6) * (0.33-(1.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2.46 + (((tickAnim - 0) / 8) * (-4.29558-(2.46)));
            yy = -6.93 + (((tickAnim - 0) / 8) * (17.83941-(-6.93)));
            zz = -2.11 + (((tickAnim - 0) / 8) * (2.92135-(-2.11)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -4.29558 + (((tickAnim - 8) / 6) * (20.19099-(-4.29558)));
            yy = 17.83941 + (((tickAnim - 8) / 6) * (-3.46445-(17.83941)));
            zz = 2.92135 + (((tickAnim - 8) / 6) * (7.63297-(2.92135)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 20.19099 + (((tickAnim - 14) / 4) * (3.81217-(20.19099)));
            yy = -3.46445 + (((tickAnim - 14) / 4) * (-11.88647-(-3.46445)));
            zz = 7.63297 + (((tickAnim - 14) / 4) * (-3.12113-(7.63297)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 3.81217 + (((tickAnim - 18) / 10) * (-4.29558-(3.81217)));
            yy = -11.88647 + (((tickAnim - 18) / 10) * (17.83941-(-11.88647)));
            zz = -3.12113 + (((tickAnim - 18) / 10) * (2.92135-(-3.12113)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -4.29558 + (((tickAnim - 28) / 6) * (20.19099-(-4.29558)));
            yy = 17.83941 + (((tickAnim - 28) / 6) * (-3.46445-(17.83941)));
            zz = 2.92135 + (((tickAnim - 28) / 6) * (7.63297-(2.92135)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 20.19099 + (((tickAnim - 34) / 4) * (3.81217-(20.19099)));
            yy = -3.46445 + (((tickAnim - 34) / 4) * (-11.88647-(-3.46445)));
            zz = 7.63297 + (((tickAnim - 34) / 4) * (-3.12113-(7.63297)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 3.81217 + (((tickAnim - 38) / 2) * (2.46-(3.81217)));
            yy = -11.88647 + (((tickAnim - 38) / 2) * (-6.93-(-11.88647)));
            zz = -3.12113 + (((tickAnim - 38) / 2) * (-2.11-(-3.12113)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 6.2 + (((tickAnim - 0) / 3) * (20.19099-(6.2)));
            yy = -8.71 + (((tickAnim - 0) / 3) * (3.46445-(-8.71)));
            zz = -4.94 + (((tickAnim - 0) / 3) * (-7.63297-(-4.94)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 20.19099 + (((tickAnim - 3) / 5) * (3.81217-(20.19099)));
            yy = 3.46445 + (((tickAnim - 3) / 5) * (11.88647-(3.46445)));
            zz = -7.63297 + (((tickAnim - 3) / 5) * (3.12113-(-7.63297)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 3.81217 + (((tickAnim - 8) / 10) * (-4.29558-(3.81217)));
            yy = 11.88647 + (((tickAnim - 8) / 10) * (-17.83941-(11.88647)));
            zz = 3.12113 + (((tickAnim - 8) / 10) * (-2.92135-(3.12113)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -4.29558 + (((tickAnim - 18) / 5) * (20.19099-(-4.29558)));
            yy = -17.83941 + (((tickAnim - 18) / 5) * (3.46445-(-17.83941)));
            zz = -2.92135 + (((tickAnim - 18) / 5) * (-7.63297-(-2.92135)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 20.19099 + (((tickAnim - 23) / 5) * (3.81217-(20.19099)));
            yy = 3.46445 + (((tickAnim - 23) / 5) * (11.88647-(3.46445)));
            zz = -7.63297 + (((tickAnim - 23) / 5) * (3.12113-(-7.63297)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 3.81217 + (((tickAnim - 28) / 10) * (-4.29558-(3.81217)));
            yy = 11.88647 + (((tickAnim - 28) / 10) * (-17.83941-(11.88647)));
            zz = 3.12113 + (((tickAnim - 28) / 10) * (-2.92135-(3.12113)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -4.29558 + (((tickAnim - 38) / 2) * (6.2-(-4.29558)));
            yy = -17.83941 + (((tickAnim - 38) / 2) * (-8.71-(-17.83941)));
            zz = -2.92135 + (((tickAnim - 38) / 2) * (-4.94-(-2.92135)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -12.6435 + (((tickAnim - 0) / 6) * (-34.26093-(-12.6435)));
            yy = 19.79889 + (((tickAnim - 0) / 6) * (-5.07045-(19.79889)));
            zz = 10.28356 + (((tickAnim - 0) / 6) * (28.14049-(10.28356)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -34.26093 + (((tickAnim - 6) / 4) * (14.90089-(-34.26093)));
            yy = -5.07045 + (((tickAnim - 6) / 4) * (-11.50299-(-5.07045)));
            zz = 28.14049 + (((tickAnim - 6) / 4) * (-13.5107-(28.14049)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 14.90089 + (((tickAnim - 10) / 5) * (8.62869-(14.90089)));
            yy = -11.50299 + (((tickAnim - 10) / 5) * (4.14795-(-11.50299)));
            zz = -13.5107 + (((tickAnim - 10) / 5) * (-1.61357-(-13.5107)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 8.62869 + (((tickAnim - 15) / 5) * (-12.6435-(8.62869)));
            yy = 4.14795 + (((tickAnim - 15) / 5) * (19.79889-(4.14795)));
            zz = -1.61357 + (((tickAnim - 15) / 5) * (10.28356-(-1.61357)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -12.6435 + (((tickAnim - 20) / 6) * (-34.26093-(-12.6435)));
            yy = 19.79889 + (((tickAnim - 20) / 6) * (-5.07045-(19.79889)));
            zz = 10.28356 + (((tickAnim - 20) / 6) * (28.14049-(10.28356)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -34.26093 + (((tickAnim - 26) / 4) * (14.90089-(-34.26093)));
            yy = -5.07045 + (((tickAnim - 26) / 4) * (-11.50299-(-5.07045)));
            zz = 28.14049 + (((tickAnim - 26) / 4) * (-13.5107-(28.14049)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 14.90089 + (((tickAnim - 30) / 5) * (8.62869-(14.90089)));
            yy = -11.50299 + (((tickAnim - 30) / 5) * (4.14795-(-11.50299)));
            zz = -13.5107 + (((tickAnim - 30) / 5) * (-1.61357-(-13.5107)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 8.62869 + (((tickAnim - 35) / 5) * (-12.6435-(8.62869)));
            yy = 4.14795 + (((tickAnim - 35) / 5) * (19.79889-(4.14795)));
            zz = -1.61357 + (((tickAnim - 35) / 5) * (10.28356-(-1.61357)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 13.86 + (((tickAnim - 0) / 4) * (8.62869-(13.86)));
            yy = 8.89 + (((tickAnim - 0) / 4) * (-4.14795-(8.89)));
            zz = 11.53 + (((tickAnim - 0) / 4) * (1.61357-(11.53)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 8.62869 + (((tickAnim - 4) / 5) * (-12.6435-(8.62869)));
            yy = -4.14795 + (((tickAnim - 4) / 5) * (-19.79889-(-4.14795)));
            zz = 1.61357 + (((tickAnim - 4) / 5) * (-10.28356-(1.61357)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -12.6435 + (((tickAnim - 9) / 6) * (-10.71868-(-12.6435)));
            yy = -19.79889 + (((tickAnim - 9) / 6) * (3.14907-(-19.79889)));
            zz = -10.28356 + (((tickAnim - 9) / 6) * (-30.1424-(-10.28356)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -10.71868 + (((tickAnim - 15) / 4) * (14.90089-(-10.71868)));
            yy = 3.14907 + (((tickAnim - 15) / 4) * (11.50299-(3.14907)));
            zz = -30.1424 + (((tickAnim - 15) / 4) * (13.5107-(-30.1424)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 14.90089 + (((tickAnim - 19) / 5) * (8.62869-(14.90089)));
            yy = 11.50299 + (((tickAnim - 19) / 5) * (-4.14795-(11.50299)));
            zz = 13.5107 + (((tickAnim - 19) / 5) * (1.61357-(13.5107)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 8.62869 + (((tickAnim - 24) / 5) * (-12.6435-(8.62869)));
            yy = -4.14795 + (((tickAnim - 24) / 5) * (-19.79889-(-4.14795)));
            zz = 1.61357 + (((tickAnim - 24) / 5) * (-10.28356-(1.61357)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -12.6435 + (((tickAnim - 29) / 6) * (-10.71868-(-12.6435)));
            yy = -19.79889 + (((tickAnim - 29) / 6) * (3.14907-(-19.79889)));
            zz = -10.28356 + (((tickAnim - 29) / 6) * (-30.1424-(-10.28356)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = -10.71868 + (((tickAnim - 35) / 4) * (14.90089-(-10.71868)));
            yy = 3.14907 + (((tickAnim - 35) / 4) * (11.50299-(3.14907)));
            zz = -30.1424 + (((tickAnim - 35) / 4) * (13.5107-(-30.1424)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 14.90089 + (((tickAnim - 39) / 1) * (13.86-(14.90089)));
            yy = 11.50299 + (((tickAnim - 39) / 1) * (8.89-(11.50299)));
            zz = 13.5107 + (((tickAnim - 39) / 1) * (11.53-(13.5107)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraPalaeopalaemon entity = (EntityPrehistoricFloraPalaeopalaemon) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(rightantenna, rightantenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*22.5/0.25+115))*5), rightantenna.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*22.5/0.25+60*3))*20), rightantenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-90))*5));


        this.setRotateAngle(leftantenna, leftantenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*22.5/0.25-115))*5), leftantenna.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*22.5/0.25+60))*20), leftantenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-90))*5));


        this.setRotateAngle(rightpleopod, rightpleopod.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-60))*20), rightpleopod.rotateAngleY + (float) Math.toRadians(0), rightpleopod.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod, leftpleopod.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-60))*20), leftpleopod.rotateAngleY + (float) Math.toRadians(0), leftpleopod.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightpleopod2, rightpleopod2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-60*2))*20), rightpleopod2.rotateAngleY + (float) Math.toRadians(0), rightpleopod2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod2, leftpleopod2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-60*2))*20), leftpleopod2.rotateAngleY + (float) Math.toRadians(0), leftpleopod2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(abdomen4, abdomen4.rotateAngleX + (float) Math.toRadians(-15), abdomen4.rotateAngleY + (float) Math.toRadians(0), abdomen4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightpleopod5, rightpleopod5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-60*5))*20), rightpleopod5.rotateAngleY + (float) Math.toRadians(0), rightpleopod5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod5, leftpleopod5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-60*5))*20), leftpleopod5.rotateAngleY + (float) Math.toRadians(0), leftpleopod5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightpleopod4, rightpleopod4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-60*4))*20), rightpleopod4.rotateAngleY + (float) Math.toRadians(0), rightpleopod4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod4, leftpleopod4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-60*4))*20), leftpleopod4.rotateAngleY + (float) Math.toRadians(0), leftpleopod4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightpleopod3, rightpleopod3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-60*3))*20), rightpleopod3.rotateAngleY + (float) Math.toRadians(0), rightpleopod3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftpleopod3, leftpleopod3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-60*3))*20), leftpleopod3.rotateAngleY + (float) Math.toRadians(0), leftpleopod3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightclaw, rightclaw.rotateAngleX + (float) Math.toRadians(9.6), rightclaw.rotateAngleY + (float) Math.toRadians(0), rightclaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightclaw2, rightclaw2.rotateAngleX + (float) Math.toRadians(0), rightclaw2.rotateAngleY + (float) Math.toRadians(0), rightclaw2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightclaw3, rightclaw3.rotateAngleX + (float) Math.toRadians(0), rightclaw3.rotateAngleY + (float) Math.toRadians(0), rightclaw3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftclaw, leftclaw.rotateAngleX + (float) Math.toRadians(9.6), leftclaw.rotateAngleY + (float) Math.toRadians(0), leftclaw.rotateAngleZ + (float) Math.toRadians(0));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPalaeopalaemon e = (EntityPrehistoricFloraPalaeopalaemon) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
